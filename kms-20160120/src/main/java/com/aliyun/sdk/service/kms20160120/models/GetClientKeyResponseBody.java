// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetClientKeyResponseBody</p>
 */
public class GetClientKeyResponseBody extends TeaModel {
    @NameInMap("AapName")
    private String aapName;

    @NameInMap("ClientKeyId")
    private String clientKeyId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @NameInMap("KeyOrigin")
    private String keyOrigin;

    @NameInMap("NotAfter")
    private String notAfter;

    @NameInMap("NotBefore")
    private String notBefore;

    @NameInMap("PublicKeyData")
    private String publicKeyData;

    @NameInMap("RequestId")
    private String requestId;

    private GetClientKeyResponseBody(Builder builder) {
        this.aapName = builder.aapName;
        this.clientKeyId = builder.clientKeyId;
        this.createTime = builder.createTime;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.keyOrigin = builder.keyOrigin;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.publicKeyData = builder.publicKeyData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return aapName
     */
    public String getAapName() {
        return this.aapName;
    }

    /**
     * @return clientKeyId
     */
    public String getClientKeyId() {
        return this.clientKeyId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * @return keyOrigin
     */
    public String getKeyOrigin() {
        return this.keyOrigin;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return publicKeyData
     */
    public String getPublicKeyData() {
        return this.publicKeyData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aapName; 
        private String clientKeyId; 
        private String createTime; 
        private String keyAlgorithm; 
        private String keyOrigin; 
        private String notAfter; 
        private String notBefore; 
        private String publicKeyData; 
        private String requestId; 

        /**
         * AapName.
         */
        public Builder aapName(String aapName) {
            this.aapName = aapName;
            return this;
        }

        /**
         * ClientKeyId.
         */
        public Builder clientKeyId(String clientKeyId) {
            this.clientKeyId = clientKeyId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * KeyAlgorithm.
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * KeyOrigin.
         */
        public Builder keyOrigin(String keyOrigin) {
            this.keyOrigin = keyOrigin;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        /**
         * PublicKeyData.
         */
        public Builder publicKeyData(String publicKeyData) {
            this.publicKeyData = publicKeyData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClientKeyResponseBody build() {
            return new GetClientKeyResponseBody(this);
        } 

    } 

}
