package com.mobtally.desktop.core.io;

import java.util.Collection;

public interface ReadPlatformService<T> {

    Collection<T> findAll();
}
