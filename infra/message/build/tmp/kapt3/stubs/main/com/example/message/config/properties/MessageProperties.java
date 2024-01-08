package com.example.message.config.properties;

@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/message/config/properties/MessageProperties;", "", "kafka", "Lcom/example/message/config/properties/MessageProperties$KafkaProps;", "(Lcom/example/message/config/properties/MessageProperties$KafkaProps;)V", "getKafka", "()Lcom/example/message/config/properties/MessageProperties$KafkaProps;", "KafkaProps", "TopicProps", "message"})
public final class MessageProperties {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.config.properties.MessageProperties.KafkaProps kafka = null;
    
    public MessageProperties(@org.jetbrains.annotations.NotNull
    com.example.message.config.properties.MessageProperties.KafkaProps kafka) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.message.config.properties.MessageProperties.KafkaProps getKafka() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/message/config/properties/MessageProperties$KafkaProps;", "", "bootstrapServers", "", "topics", "Lcom/example/message/config/properties/MessageProperties$TopicProps;", "(Ljava/lang/String;Lcom/example/message/config/properties/MessageProperties$TopicProps;)V", "getBootstrapServers", "()Ljava/lang/String;", "getTopics", "()Lcom/example/message/config/properties/MessageProperties$TopicProps;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "message"})
    public static final class KafkaProps {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String bootstrapServers = null;
        @org.jetbrains.annotations.NotNull
        private final com.example.message.config.properties.MessageProperties.TopicProps topics = null;
        
        public KafkaProps(@org.jetbrains.annotations.NotNull
        java.lang.String bootstrapServers, @org.jetbrains.annotations.NotNull
        com.example.message.config.properties.MessageProperties.TopicProps topics) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBootstrapServers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.message.config.properties.MessageProperties.TopicProps getTopics() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.message.config.properties.MessageProperties.TopicProps component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.message.config.properties.MessageProperties.KafkaProps copy(@org.jetbrains.annotations.NotNull
        java.lang.String bootstrapServers, @org.jetbrains.annotations.NotNull
        com.example.message.config.properties.MessageProperties.TopicProps topics) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/example/message/config/properties/MessageProperties$TopicProps;", "", "inMessage", "", "outMessage", "outAlert", "doneSpamProcess", "doneRecentChatProcess", "step1", "step2", "step3", "step4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDoneRecentChatProcess", "()Ljava/lang/String;", "getDoneSpamProcess", "getInMessage", "getOutAlert", "getOutMessage", "getStep1", "getStep2", "getStep3", "getStep4", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "message"})
    public static final class TopicProps {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String inMessage = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String outMessage = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String outAlert = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String doneSpamProcess = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String doneRecentChatProcess = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String step1 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String step2 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String step3 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String step4 = null;
        
        public TopicProps(@org.jetbrains.annotations.NotNull
        java.lang.String inMessage, @org.jetbrains.annotations.NotNull
        java.lang.String outMessage, @org.jetbrains.annotations.NotNull
        java.lang.String outAlert, @org.jetbrains.annotations.NotNull
        java.lang.String doneSpamProcess, @org.jetbrains.annotations.NotNull
        java.lang.String doneRecentChatProcess, @org.jetbrains.annotations.NotNull
        java.lang.String step1, @org.jetbrains.annotations.NotNull
        java.lang.String step2, @org.jetbrains.annotations.NotNull
        java.lang.String step3, @org.jetbrains.annotations.NotNull
        java.lang.String step4) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getInMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOutMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOutAlert() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDoneSpamProcess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDoneRecentChatProcess() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStep1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStep2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStep3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStep4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.message.config.properties.MessageProperties.TopicProps copy(@org.jetbrains.annotations.NotNull
        java.lang.String inMessage, @org.jetbrains.annotations.NotNull
        java.lang.String outMessage, @org.jetbrains.annotations.NotNull
        java.lang.String outAlert, @org.jetbrains.annotations.NotNull
        java.lang.String doneSpamProcess, @org.jetbrains.annotations.NotNull
        java.lang.String doneRecentChatProcess, @org.jetbrains.annotations.NotNull
        java.lang.String step1, @org.jetbrains.annotations.NotNull
        java.lang.String step2, @org.jetbrains.annotations.NotNull
        java.lang.String step3, @org.jetbrains.annotations.NotNull
        java.lang.String step4) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
}