This project is to log analytics data to a file which is generated in wso2 APIM gateway.

configuration
==============

- copy the target/com.rukspot.samples.log_analytics-1.0-SNAPSHOT.jar to <APIM_HOME_300>/repository/components/lib/ dir
- enabled analytics and define custom publisher
    - open <APIM_HOME_300>/repository/conf/deployment.toml
    ```
     [apim.analytics]
     enable = true
     event_publisher_impl = "com.rukspot.samples.analytics.publisher.FilePublisher"
     ```
       
- add the logging configuration to <APIM_HOME_300>/repository/conf/log4j2.properties

 ```
logger.com-rukspot-analytics.name = com.rukspot.samples.analytics.publisher
logger.com-rukspot-analytics.level = INFO

#append the `com-rukspot-analytics` to loggers 
loggers = AUDIT_LOG, com-rukspot-analytics,
 ```