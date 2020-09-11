package com.cxplan.projection.core.image;

import lombok.Data;

/**
 * @author Kenny
 * created on 2018/11/22
 */
@Data
public abstract class AbstractImageSession implements IImageSession {


    protected ImageSessionID sessionID;

    AbstractImageSession(ImageSessionID sessionID) {
        this.sessionID = sessionID;
    }


}
