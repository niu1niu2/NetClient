package com.guinong.bean;

import java.io.Serializable;

public class BaseBean implements Serializable {
    protected Boolean success;
    protected ErrorBean error;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ErrorBean getError() {
        return error;
    }

    public void setError(ErrorBean error) {
        this.error = error;
    }
}
