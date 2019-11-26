package com.core.example.app;
//只能被初始化依次，线程安全
public enum ConfigType {
    API_HOST,
    APPLICATION_CONTEXT,
    CONFIG_READY,
    ICON
}
