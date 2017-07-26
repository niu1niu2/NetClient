package com.guinong.net;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.lang.reflect.Type;

/**
 * @author csn
 * @date 2017/7/26 0026 15:13
 * @content
 */
public class NetworkResultMessage extends NetworkMessage {

    public NetworkResultMessage(NetworkMessage msg) {
        if (msg != null) {
            this.setSuccess(msg.isSuccess());
            this.setError(msg.getError());
        }
    }

    private JsonElement result;

    public JsonElement getResult() {
        return result;
    }

    public void setResult(JsonElement result) {
        this.result = result;
    }

    /**
     * @param resultClass
     * @param gson
     * @param <TResult>
     */
    public <TResult> TResult ToResult(Class<TResult> resultClass, Gson gson) {
        if (result == null || result.isJsonNull()) {
            return null;
        }
        return gson.fromJson(result, resultClass);
    }

    /**
     * @param resultType
     * @param gson
     * @param <TResult>
     * @return
     */
    public <TResult> TResult ToTypeResult(Type resultType, Gson gson) {
        if (result == null || result.isJsonNull()) {
            return null;
        }
        return gson.fromJson(result, resultType);
    }

}
