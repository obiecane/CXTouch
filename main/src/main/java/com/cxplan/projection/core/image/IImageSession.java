package com.cxplan.projection.core.image;

import java.io.Closeable;

/**
 * @author kenny
 *
 * created on 2018-11-22
 */
public interface IImageSession extends Closeable {

    /**
     * Return the ID of node.
     */
    ImageSessionID getSessionID();

    /**
     *
     * @param data the image data.
     * @param offset the offset of byte array.
     * @param size the length of valid data in byte array.
     */
    void writeImageData(byte[] data, int offset, int size);

    /**
     * Close the image session channel.
     */
    @Override
    void close() throws RuntimeException;
}
