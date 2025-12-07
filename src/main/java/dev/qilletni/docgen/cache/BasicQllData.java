package dev.qilletni.docgen.cache;

import dev.qilletni.api.lib.qll.QllInfo;

public record BasicQllData(String scope, String name, String version, String author, String description, String sourceUrl) {
    public BasicQllData(QllInfo libraryQll) {
        this(libraryQll.scope(), libraryQll.name(), libraryQll.version().getVersionString(), libraryQll.author(), libraryQll.description(), libraryQll.sourceUrl());
    }
}
