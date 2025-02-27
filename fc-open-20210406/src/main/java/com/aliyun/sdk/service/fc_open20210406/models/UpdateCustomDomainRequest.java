// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomDomainRequest</p>
 */
public class UpdateCustomDomainRequest extends Request {
    @Path
    @NameInMap("domainName")
    @Validation(required = true)
    private String domainName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("certConfig")
    private CertConfig certConfig;

    @Body
    @NameInMap("protocol")
    private String protocol;

    @Body
    @NameInMap("routeConfig")
    private RouteConfig routeConfig;

    @Body
    @NameInMap("tlsConfig")
    private TLSConfig tlsConfig;

    @Body
    @NameInMap("wafConfig")
    private WAFConfig wafConfig;

    private UpdateCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.certConfig = builder.certConfig;
        this.protocol = builder.protocol;
        this.routeConfig = builder.routeConfig;
        this.tlsConfig = builder.tlsConfig;
        this.wafConfig = builder.wafConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return certConfig
     */
    public CertConfig getCertConfig() {
        return this.certConfig;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return routeConfig
     */
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    /**
     * @return tlsConfig
     */
    public TLSConfig getTlsConfig() {
        return this.tlsConfig;
    }

    /**
     * @return wafConfig
     */
    public WAFConfig getWafConfig() {
        return this.wafConfig;
    }

    public static final class Builder extends Request.Builder<UpdateCustomDomainRequest, Builder> {
        private String domainName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private CertConfig certConfig; 
        private String protocol; 
        private RouteConfig routeConfig; 
        private TLSConfig tlsConfig; 
        private WAFConfig wafConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.certConfig = request.certConfig;
            this.protocol = request.protocol;
            this.routeConfig = request.routeConfig;
            this.tlsConfig = request.tlsConfig;
            this.wafConfig = request.wafConfig;
        } 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the operation is called. The format is: **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The custom request ID.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The configurations of the HTTPS certificate.
         */
        public Builder certConfig(CertConfig certConfig) {
            this.putBodyParameter("certConfig", certConfig);
            this.certConfig = certConfig;
            return this;
        }

        /**
         * The protocol types supported by the domain name. Valid values:
         * <p>
         * 
         * *   **HTTP**: Only HTTP is supported.
         * *   **HTTPS**: Only HTTPS is supported.
         * *   **HTTP,HTTPS**: HTTP and HTTPS are supported.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * The route table that maps the paths to functions when the functions are invoked by using the custom domain name.
         */
        public Builder routeConfig(RouteConfig routeConfig) {
            this.putBodyParameter("routeConfig", routeConfig);
            this.routeConfig = routeConfig;
            return this;
        }

        /**
         * The Transport Layer Security (TLS) configuration.
         */
        public Builder tlsConfig(TLSConfig tlsConfig) {
            this.putBodyParameter("tlsConfig", tlsConfig);
            this.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * The Web Application Firewall (WAF) configuration.
         */
        public Builder wafConfig(WAFConfig wafConfig) {
            this.putBodyParameter("wafConfig", wafConfig);
            this.wafConfig = wafConfig;
            return this;
        }

        @Override
        public UpdateCustomDomainRequest build() {
            return new UpdateCustomDomainRequest(this);
        } 

    } 

}
