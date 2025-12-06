module qilletni.docgen {
    requires qilletni.impl;
    requires qilletni.api;
    
    requires thymeleaf;
    requires org.slf4j;
    requires unbescape;
    requires msgpack.core;
    requires com.google.gson;
    requires flexmark;
    requires flexmark.util.ast;
    requires flexmark.util.data;

    exports dev.qilletni.docgen;
}
