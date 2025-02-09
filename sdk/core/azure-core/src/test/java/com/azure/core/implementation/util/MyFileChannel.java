// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.implementation.util;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public abstract class MyFileChannel extends FileChannel {
    // Needed by Mockito
    public MyFileChannel() {
        super();
    }

    @Override
    public MappedByteBuffer map(MapMode mode, long position, long size) throws IOException {
        return null;
    }

    @Override
    protected void implCloseChannel() throws IOException {
    }
}
