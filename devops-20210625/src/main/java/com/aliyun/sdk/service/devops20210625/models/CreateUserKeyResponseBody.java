// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserKeyResponseBody</p>
 */
public class CreateUserKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private CreateUserKeyResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateUserKeyResponseBody build() {
            return new CreateUserKeyResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("expireTime")
        private String expireTime;

        @NameInMap("fingerPrint")
        private String fingerPrint;

        @NameInMap("id")
        private Long id;

        @NameInMap("keyScope")
        private String keyScope;

        @NameInMap("lastUsedTime")
        private String lastUsedTime;

        @NameInMap("publicKey")
        private String publicKey;

        @NameInMap("title")
        private String title;

        private Result(Builder builder) {
            this.createdAt = builder.createdAt;
            this.expireTime = builder.expireTime;
            this.fingerPrint = builder.fingerPrint;
            this.id = builder.id;
            this.keyScope = builder.keyScope;
            this.lastUsedTime = builder.lastUsedTime;
            this.publicKey = builder.publicKey;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fingerPrint
         */
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return keyScope
         */
        public String getKeyScope() {
            return this.keyScope;
        }

        /**
         * @return lastUsedTime
         */
        public String getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String createdAt; 
            private String expireTime; 
            private String fingerPrint; 
            private Long id; 
            private String keyScope; 
            private String lastUsedTime; 
            private String publicKey; 
            private String title; 

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * fingerPrint.
             */
            public Builder fingerPrint(String fingerPrint) {
                this.fingerPrint = fingerPrint;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * keyScope.
             */
            public Builder keyScope(String keyScope) {
                this.keyScope = keyScope;
                return this;
            }

            /**
             * lastUsedTime.
             */
            public Builder lastUsedTime(String lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * publicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
