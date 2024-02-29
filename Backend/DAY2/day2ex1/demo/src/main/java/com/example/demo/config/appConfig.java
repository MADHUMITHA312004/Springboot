package com.example.demo.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class appConfig {
   @Value("${app.name}")
   private String appNmae;
   @Value("${app.version}")
   private int appVersion;
   
   public appConfig()
   {
    
   }
   public appConfig(String appName,int appVersion)
   {
    this.appNmae=appName;
    this.appVersion=appVersion;
   }

public String getAppNmae() {
    return appNmae;
}

public void setAppNmae(String appNmae) {
    this.appNmae = appNmae;
}

public int getAppVersion() {
    return appVersion;
}

public void setAppVersion(int appVersion) {
    this.appVersion = appVersion;
}

    
}
