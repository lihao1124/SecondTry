package com.example.i.firstapp;

import java.io.Serializable;

/**
 * Created by i on 2017/10/30.
 */

public class Outer {
    private InnerStatic innerStatic;
    public InnerStatic getInnerStatic() {
        return innerStatic;
    }

    public void setInnerStatic(InnerStatic innerStatic) {
        this.innerStatic = innerStatic;
    }
    public static class InnerStatic implements Serializable {
        private int error;
        private String message;

        public int getError() {
            return error;
        }

        public void setError(int error) {
            this.error = error;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
