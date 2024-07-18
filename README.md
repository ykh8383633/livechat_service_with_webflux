# Live Chat Service with Webflux

### 주요 구현사항
 - 여러 consumer 서버가 Pipeline을 이루어 최근 채팅 저장, 유효성 검사, 금기어 처리 등을 처리하는 구조로 설계
 - Aho-Corasick 알고리즘을 통해 효과적으로 금기어를 감지하여 처리
 - 관리자 알림 메세지 전송

### 프로젝트 구조
![image](https://github.com/ykh8383633/livechat_service_with_webflux/assets/86603009/303a5907-7506-41d3-95a7-6dfb297a9837)

### Overview
![image](https://github.com/ykh8383633/livechat_service_with_webflux/assets/86603009/c6c0d7ce-a64c-483b-b4e7-fdd9f1b7ab9f)
