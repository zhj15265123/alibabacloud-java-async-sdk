// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallEnvironmentFeatureResponseBody} extends {@link TeaModel}
 *
 * <p>InstallEnvironmentFeatureResponseBody</p>
 */
public class InstallEnvironmentFeatureResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private InstallEnvironmentFeatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallEnvironmentFeatureResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status code: 200 indicates success.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * ReleaseId after installation.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Prompt message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * api was successful:
         * <p>
         * 
         * - true: success.
         * - false: fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public InstallEnvironmentFeatureResponseBody build() {
            return new InstallEnvironmentFeatureResponseBody(this);
        } 

    } 

}
