package com.cxplan.projection;

import com.cxplan.projection.core.connection.DeviceConnectionListener;
import com.cxplan.projection.core.connection.IDeviceConnection;
import com.cxplan.projection.script.io.ScriptDeviceConnection;
import com.cxplan.projection.service.IDeviceService;
import com.cxplan.projection.service.IInfrastructureService;
import com.cxplan.projection.service.IScriptService;

import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * 代表一个当前应用
 * 类似于全局上下文
 * @author KennyLiu
 * @created on 2017/8/31
 */
public interface IApplication {

    //session properties
    String CLIENT_ID = "ID";
    String CLIENT_SESSION = "client_session";
    String CLIENT_TICKET = "t";

    /**
     * Return the name of device.
     * @param deviceId device ID。
     */
    String getDeviceName(String deviceId);
    /**
     * Return id list of all phone which is connected to controller system.
     */
    List<String> getDeviceList();

    /**
     * Return the device connection according to specified id.
     */
    IDeviceConnection getDeviceConnection(String deviceId);

    /**
     * Return the connection with script server according to device ID.
     *
     * @param deviceId the device ID.
     * @return the connection with script server.
     */
    ScriptDeviceConnection getScriptConnection(String deviceId);
    /**
     * Return a thread pool instance.
     * Not null.
     */
    ExecutorService getExecutors();

    /**
     *Return service which operation is related with device .
     */
    IDeviceService getDeviceService();

    /**
     * Return the script service for automator.
     */
    IScriptService getScriptService();
    /**
     * Return infrastructure service
     */
    IInfrastructureService getInfrastructureService();

    /**
     * Add listener to device connection.
     */
    void addDeviceConnectionListener(DeviceConnectionListener listener);

    /**
     * Remove listener to device connection.
     */
    void removeDeviceConnectionListener(DeviceConnectionListener listener);
}
