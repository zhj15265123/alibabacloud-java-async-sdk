// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceRuleSaveResponseBody} extends {@link TeaModel}
 *
 * <p>InvoiceRuleSaveResponseBody</p>
 */
public class InvoiceRuleSaveResponseBody extends TeaModel {
    @NameInMap("code")
    private Integer code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private InvoiceRuleSaveResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceRuleSaveResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * 结果代码
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 备注，结果的备注，如对结果的说明
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 返回值，服务端返回，没有结果或发生异常都返回空
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 成功标识，由服务端设置，发生异常时为false。结果为null设置为false。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public InvoiceRuleSaveResponseBody build() {
            return new InvoiceRuleSaveResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("add_num")
        private Integer addNum;

        @NameInMap("remove_num")
        private Integer removeNum;

        private Module(Builder builder) {
            this.addNum = builder.addNum;
            this.removeNum = builder.removeNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return addNum
         */
        public Integer getAddNum() {
            return this.addNum;
        }

        /**
         * @return removeNum
         */
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public static final class Builder {
            private Integer addNum; 
            private Integer removeNum; 

            /**
             * add_num.
             */
            public Builder addNum(Integer addNum) {
                this.addNum = addNum;
                return this;
            }

            /**
             * remove_num.
             */
            public Builder removeNum(Integer removeNum) {
                this.removeNum = removeNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
