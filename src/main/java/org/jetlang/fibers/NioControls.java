package org.jetlang.fibers;

import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;

public interface NioControls {
    void addHandler(NioChannelHandler handler);

    <T extends SelectableChannel & WritableByteChannel> void write(T channel, ByteBuffer buffer);

    boolean close(SelectableChannel channel);
}
