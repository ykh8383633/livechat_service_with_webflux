package com.example.message.subscriber.handler

import com.example.message.channel.Channel
import com.example.message.channel.InMessageChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.publisher.Publisher
import org.springframework.beans.factory.annotation.Autowired

abstract class ChatProcessorMessageHandler: MessageHandler {
    private var _subscribedChannel: Channel? = null;
    private var _publishChannel: Channel? = null;

    protected abstract val processStep: Int
    protected abstract val lastStep: Int;
    protected abstract val publisher: Publisher;
    @Autowired protected val allChannels: MutableList<Channel> = mutableListOf();

    override val subscribedChannel: Channel
        get() {
            if(_subscribedChannel == null){
                _subscribedChannel = getSubChannel()
            }

            return _subscribedChannel as Channel
        }

    val publishChannel: Channel
        get() {
            if(_publishChannel == null){
                _publishChannel = getPubChannel()
            }

            return _publishChannel as Channel
        }


    open fun doNextStep(nextMessage: String){
        publisher.publish(publishChannel.channelName, nextMessage);
    }

    open fun jumpToLastStep(nextMessage: String){
        val lastStepChannel = getLastStepChannel()
        publisher.publish(lastStepChannel.channelName, nextMessage);
    }

    protected open fun getSubChannel(): Channel{
        if(processStep == 1){
            return allChannels.find { it is InMessageChannel } ?: throw Exception("channel create error")
        }

        val channelName = getChannelName(processStep)
        return parseChannel(channelName)
    }

    protected open fun getPubChannel(): Channel{
        if(processStep == lastStep){
            return allChannels.find { it is OutMessageChannel } ?: throw Exception("channel create error")
        }

        val channelName = getChannelName(processStep + 1)
        return parseChannel(channelName)
    }

    protected open fun getLastStepChannel(): Channel{
        val channelName = getChannelName(lastStep);
        return parseChannel(channelName);
    }

    private fun parseChannel(channelName: String): Channel{
        return allChannels.find { it.channelName == channelName } ?: throw  Exception("Invalid Channel Name!!")
    }

    private fun getChannelName(stepNum: Int): String{
        return "chatProcess-step${stepNum}"
    }
}