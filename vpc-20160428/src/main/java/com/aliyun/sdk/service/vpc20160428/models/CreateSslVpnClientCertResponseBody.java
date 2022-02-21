// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSslVpnClientCertResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSslVpnClientCertResponseBody</p>
 */
public class CreateSslVpnClientCertResponseBody extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    private CreateSslVpnClientCertResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sslVpnClientCertId = builder.sslVpnClientCertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSslVpnClientCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sslVpnClientCertId
     */
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 
        private String sslVpnClientCertId; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SslVpnClientCertId.
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        public CreateSslVpnClientCertResponseBody build() {
            return new CreateSslVpnClientCertResponseBody(this);
        } 

    } 

}
