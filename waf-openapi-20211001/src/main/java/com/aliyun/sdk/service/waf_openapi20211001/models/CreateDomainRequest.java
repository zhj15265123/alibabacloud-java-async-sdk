// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
    @Query
    @NameInMap("AccessType")
    private String accessType;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Listen")
    @Validation(required = true)
    private Listen listen;

    @Query
    @NameInMap("Redirect")
    @Validation(required = true)
    private Redirect redirect;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.listen = builder.listen;
        this.redirect = builder.redirect;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return listen
     */
    public Listen getListen() {
        return this.listen;
    }

    /**
     * @return redirect
     */
    public Redirect getRedirect() {
        return this.redirect;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private String accessType; 
        private String domain; 
        private String instanceId; 
        private Listen listen; 
        private Redirect redirect; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.listen = request.listen;
            this.redirect = request.redirect;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The mode in which you want to add the domain name to WAF. Valid values:
         * <p>
         * 
         * *   **share:** adds the domain name to WAF in CNAME record mode. This is the default value.
         * *   **hybrid_cloud_cname:** adds the domain name to WAF in hybrid cloud reverse proxy mode.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
        }

        /**
         * The domain name that you want to add to WAF.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The configurations of the listeners.
         */
        public Builder listen(Listen listen) {
            String listenShrink = shrink(listen, "Listen", "json");
            this.putQueryParameter("Listen", listenShrink);
            this.listen = listen;
            return this;
        }

        /**
         * The configurations of the forwarding rule.
         */
        public Builder redirect(Redirect redirect) {
            String redirectShrink = shrink(redirect, "Redirect", "json");
            this.putQueryParameter("Redirect", redirectShrink);
            this.redirect = redirect;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: the Chinese mainland
         * *   **ap-southeast-1**: outside the Chinese mainland
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The source IP address of the request. You do not need to specify this parameter. It is automatically obtained by the system.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

    public static class Listen extends TeaModel {
        @NameInMap("CertId")
        private String certId;

        @NameInMap("CipherSuite")
        private Integer cipherSuite;

        @NameInMap("CustomCiphers")
        private java.util.List < String > customCiphers;

        @NameInMap("EnableTLSv3")
        private Boolean enableTLSv3;

        @NameInMap("ExclusiveIp")
        private Boolean exclusiveIp;

        @NameInMap("FocusHttps")
        private Boolean focusHttps;

        @NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @NameInMap("HttpPorts")
        private java.util.List < Integer > httpPorts;

        @NameInMap("HttpsPorts")
        private java.util.List < Integer > httpsPorts;

        @NameInMap("IPv6Enabled")
        private Boolean iPv6Enabled;

        @NameInMap("ProtectionResource")
        private String protectionResource;

        @NameInMap("SM2AccessOnly")
        private Boolean sM2AccessOnly;

        @NameInMap("SM2CertId")
        private String sM2CertId;

        @NameInMap("SM2Enabled")
        private Boolean sM2Enabled;

        @NameInMap("TLSVersion")
        private String TLSVersion;

        @NameInMap("XffHeaderMode")
        private Integer xffHeaderMode;

        @NameInMap("XffHeaders")
        private java.util.List < String > xffHeaders;

        private Listen(Builder builder) {
            this.certId = builder.certId;
            this.cipherSuite = builder.cipherSuite;
            this.customCiphers = builder.customCiphers;
            this.enableTLSv3 = builder.enableTLSv3;
            this.exclusiveIp = builder.exclusiveIp;
            this.focusHttps = builder.focusHttps;
            this.http2Enabled = builder.http2Enabled;
            this.httpPorts = builder.httpPorts;
            this.httpsPorts = builder.httpsPorts;
            this.iPv6Enabled = builder.iPv6Enabled;
            this.protectionResource = builder.protectionResource;
            this.sM2AccessOnly = builder.sM2AccessOnly;
            this.sM2CertId = builder.sM2CertId;
            this.sM2Enabled = builder.sM2Enabled;
            this.TLSVersion = builder.TLSVersion;
            this.xffHeaderMode = builder.xffHeaderMode;
            this.xffHeaders = builder.xffHeaders;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listen create() {
            return builder().build();
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return cipherSuite
         */
        public Integer getCipherSuite() {
            return this.cipherSuite;
        }

        /**
         * @return customCiphers
         */
        public java.util.List < String > getCustomCiphers() {
            return this.customCiphers;
        }

        /**
         * @return enableTLSv3
         */
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        /**
         * @return exclusiveIp
         */
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        /**
         * @return focusHttps
         */
        public Boolean getFocusHttps() {
            return this.focusHttps;
        }

        /**
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        /**
         * @return httpPorts
         */
        public java.util.List < Integer > getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List < Integer > getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return iPv6Enabled
         */
        public Boolean getIPv6Enabled() {
            return this.iPv6Enabled;
        }

        /**
         * @return protectionResource
         */
        public String getProtectionResource() {
            return this.protectionResource;
        }

        /**
         * @return sM2AccessOnly
         */
        public Boolean getSM2AccessOnly() {
            return this.sM2AccessOnly;
        }

        /**
         * @return sM2CertId
         */
        public String getSM2CertId() {
            return this.sM2CertId;
        }

        /**
         * @return sM2Enabled
         */
        public Boolean getSM2Enabled() {
            return this.sM2Enabled;
        }

        /**
         * @return TLSVersion
         */
        public String getTLSVersion() {
            return this.TLSVersion;
        }

        /**
         * @return xffHeaderMode
         */
        public Integer getXffHeaderMode() {
            return this.xffHeaderMode;
        }

        /**
         * @return xffHeaders
         */
        public java.util.List < String > getXffHeaders() {
            return this.xffHeaders;
        }

        public static final class Builder {
            private String certId; 
            private Integer cipherSuite; 
            private java.util.List < String > customCiphers; 
            private Boolean enableTLSv3; 
            private Boolean exclusiveIp; 
            private Boolean focusHttps; 
            private Boolean http2Enabled; 
            private java.util.List < Integer > httpPorts; 
            private java.util.List < Integer > httpsPorts; 
            private Boolean iPv6Enabled; 
            private String protectionResource; 
            private Boolean sM2AccessOnly; 
            private String sM2CertId; 
            private Boolean sM2Enabled; 
            private String TLSVersion; 
            private Integer xffHeaderMode; 
            private java.util.List < String > xffHeaders; 

            /**
             * The ID of the certificate that you want to add. This parameter is available only if you specify **HttpsPorts**.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The type of cipher suite that you want to add. This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **1:** all cipher suites.
             * *   **2:** strong cipher suites. You can select this value only if you set **TLSVersion** to **tlsv1.2**.
             * *   **99:** custom cipher suites.
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * The custom cipher suite that you want to add.
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * Specifies whether to support TLS 1.3. This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableTLSv3(Boolean enableTLSv3) {
                this.enableTLSv3 = enableTLSv3;
                return this;
            }

            /**
             * Specifies whether to enable an exclusive IP address. This parameter is available only if you set **IPv6Enabled** to **false** and **ProtectionResource** to **share**. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * Specifies whether to enable HTTP to HTTPS redirection. This parameter is available only if you specify HttpsPorts and leave HttpPorts empty. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder focusHttps(Boolean focusHttps) {
                this.focusHttps = focusHttps;
                return this;
            }

            /**
             * Specifies whether to enable HTTP/2. This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * The HTTP listener port.
             */
            public Builder httpPorts(java.util.List < Integer > httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * The HTTPS listener port.
             */
            public Builder httpsPorts(java.util.List < Integer > httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * Specifies whether to enable IPv6. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder iPv6Enabled(Boolean iPv6Enabled) {
                this.iPv6Enabled = iPv6Enabled;
                return this;
            }

            /**
             * The type of the protection resource. Valid values:
             * <p>
             * 
             * *   **share:** a shared cluster. This is the default value.
             * *   **gslb:** shared cluster-based intelligent load balancing.
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * Specifies whether to allow access only from SM certificate-based clients. This parameter is available only if you set SM2Enabled to true.
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder sM2AccessOnly(Boolean sM2AccessOnly) {
                this.sM2AccessOnly = sM2AccessOnly;
                return this;
            }

            /**
             * The ID of the SM certificate that you want to add. This parameter is available only if you set SM2Enabled to true.
             */
            public Builder sM2CertId(String sM2CertId) {
                this.sM2CertId = sM2CertId;
                return this;
            }

            /**
             * Specifies whether to enable the ShangMi (SM) certificate.
             */
            public Builder sM2Enabled(Boolean sM2Enabled) {
                this.sM2Enabled = sM2Enabled;
                return this;
            }

            /**
             * The version of the Transport Layer Security (TLS) protocol. This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **tlsv1**
             * *   **tlsv1.1**
             * *   **tlsv1.2**
             */
            public Builder TLSVersion(String TLSVersion) {
                this.TLSVersion = TLSVersion;
                return this;
            }

            /**
             * The method that you want WAF to use to obtain the actual IP address of a client. Valid values:
             * <p>
             * 
             * *   **0:** No Layer 7 proxies are deployed in front of WAF. This is the default value.
             * *   **1:** WAF reads the first value of the X-Forwarded-For (XFF) header field as the IP address of the client.
             * *   **2:** WAF reads the value of a custom header field as the IP address of the client.
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * The custom header field that you want WAF to use to obtain the actual IP address of a client.
             */
            public Builder xffHeaders(java.util.List < String > xffHeaders) {
                this.xffHeaders = xffHeaders;
                return this;
            }

            public Listen build() {
                return new Listen(this);
            } 

        } 

    }
    public static class RequestHeaders extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private RequestHeaders(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaders create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the custom header field.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the custom header field.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequestHeaders build() {
                return new RequestHeaders(this);
            } 

        } 

    }
    public static class Redirect extends TeaModel {
        @NameInMap("Backends")
        private java.util.List < String > backends;

        @NameInMap("CnameEnabled")
        private Boolean cnameEnabled;

        @NameInMap("ConnectTimeout")
        @Validation(maximum = 3600, minimum = 1)
        private Integer connectTimeout;

        @NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @NameInMap("Keepalive")
        private Boolean keepalive;

        @NameInMap("KeepaliveRequests")
        @Validation(maximum = 1000, minimum = 60)
        private Integer keepaliveRequests;

        @NameInMap("KeepaliveTimeout")
        @Validation(maximum = 3600, minimum = 10)
        private Integer keepaliveTimeout;

        @NameInMap("Loadbalance")
        @Validation(required = true)
        private String loadbalance;

        @NameInMap("ReadTimeout")
        @Validation(maximum = 3600, minimum = 1)
        private Integer readTimeout;

        @NameInMap("RequestHeaders")
        private java.util.List < RequestHeaders> requestHeaders;

        @NameInMap("Retry")
        private Boolean retry;

        @NameInMap("RoutingRules")
        private String routingRules;

        @NameInMap("SniEnabled")
        private Boolean sniEnabled;

        @NameInMap("SniHost")
        private String sniHost;

        @NameInMap("WriteTimeout")
        @Validation(maximum = 3600, minimum = 1)
        private Integer writeTimeout;

        private Redirect(Builder builder) {
            this.backends = builder.backends;
            this.cnameEnabled = builder.cnameEnabled;
            this.connectTimeout = builder.connectTimeout;
            this.focusHttpBackend = builder.focusHttpBackend;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadbalance = builder.loadbalance;
            this.readTimeout = builder.readTimeout;
            this.requestHeaders = builder.requestHeaders;
            this.retry = builder.retry;
            this.routingRules = builder.routingRules;
            this.sniEnabled = builder.sniEnabled;
            this.sniHost = builder.sniHost;
            this.writeTimeout = builder.writeTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Redirect create() {
            return builder().build();
        }

        /**
         * @return backends
         */
        public java.util.List < String > getBackends() {
            return this.backends;
        }

        /**
         * @return cnameEnabled
         */
        public Boolean getCnameEnabled() {
            return this.cnameEnabled;
        }

        /**
         * @return connectTimeout
         */
        public Integer getConnectTimeout() {
            return this.connectTimeout;
        }

        /**
         * @return focusHttpBackend
         */
        public Boolean getFocusHttpBackend() {
            return this.focusHttpBackend;
        }

        /**
         * @return keepalive
         */
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        /**
         * @return keepaliveRequests
         */
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        /**
         * @return loadbalance
         */
        public String getLoadbalance() {
            return this.loadbalance;
        }

        /**
         * @return readTimeout
         */
        public Integer getReadTimeout() {
            return this.readTimeout;
        }

        /**
         * @return requestHeaders
         */
        public java.util.List < RequestHeaders> getRequestHeaders() {
            return this.requestHeaders;
        }

        /**
         * @return retry
         */
        public Boolean getRetry() {
            return this.retry;
        }

        /**
         * @return routingRules
         */
        public String getRoutingRules() {
            return this.routingRules;
        }

        /**
         * @return sniEnabled
         */
        public Boolean getSniEnabled() {
            return this.sniEnabled;
        }

        /**
         * @return sniHost
         */
        public String getSniHost() {
            return this.sniHost;
        }

        /**
         * @return writeTimeout
         */
        public Integer getWriteTimeout() {
            return this.writeTimeout;
        }

        public static final class Builder {
            private java.util.List < String > backends; 
            private Boolean cnameEnabled; 
            private Integer connectTimeout; 
            private Boolean focusHttpBackend; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private String loadbalance; 
            private Integer readTimeout; 
            private java.util.List < RequestHeaders> requestHeaders; 
            private Boolean retry; 
            private String routingRules; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Integer writeTimeout; 

            /**
             * The IP addresses or domain names of the origin server.
             */
            public Builder backends(java.util.List < String > backends) {
                this.backends = backends;
                return this;
            }

            /**
             * Specifies whether to enable the public cloud disaster recovery feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder cnameEnabled(Boolean cnameEnabled) {
                this.cnameEnabled = cnameEnabled;
                return this;
            }

            /**
             * The connection timeout period. Unit: seconds. Valid values: 1 to 3600.
             */
            public Builder connectTimeout(Integer connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * Specifies whether to enable HTTPS to HTTP redirection for back-to-origin requests. This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder focusHttpBackend(Boolean focusHttpBackend) {
                this.focusHttpBackend = focusHttpBackend;
                return this;
            }

            /**
             * Specifies whether to enable the persistent connection feature. Valid values:
             * <p>
             * 
             * *   **true** (default)
             * *   **false**
             */
            public Builder keepalive(Boolean keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * The number of reused persistent connections. Valid values: 60 to 1000.
             * <p>
             * 
             * > This parameter specifies the number of reused persistent connections after you enable the persistent connection feature.
             */
            public Builder keepaliveRequests(Integer keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * The timeout period of persistent connections that are in the Idle state. Valid values: 1 to 60. Default value: 15. Unit: seconds.
             * <p>
             * 
             * > This parameter specifies the period of time during which a reused persistent connection is allowed to remain in the Idle state before the persistent connection is released.
             */
            public Builder keepaliveTimeout(Integer keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * The load balancing algorithm that you want WAF to use to forward requests to the origin server. Valid values:
             * <p>
             * 
             * *   **iphash**
             * *   **roundRobin**
             * *   **leastTime**. You can select this value only if you set **ProtectionResource** to **gslb**.
             */
            public Builder loadbalance(String loadbalance) {
                this.loadbalance = loadbalance;
                return this;
            }

            /**
             * The read timeout period. Unit: seconds. Valid values: 1 to 3600.
             */
            public Builder readTimeout(Integer readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * The key-value pairs that you want to use to label the requests that pass through the WAF instance.
             * <p>
             * 
             * WAF automatically adds the key-value pairs to request headers. This way, the backend service can identify requests that pass through WAF.
             */
            public Builder requestHeaders(java.util.List < RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * Specifies whether WAF retries to forward requests when the requests fail to be forwarded to the origin server. Valid values:
             * <p>
             * 
             * *   **true** (default)
             * *   **false**
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * The forwarding rules that you want to configure for the domain name that you want to add to WAF in hybrid cloud mode. Set the value to a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
             * <p>
             * 
             * *   **rs:** The back-to-origin IP addresses or CNAMEs. The value must be of the ARRAY type.
             * *   **location:** The name of the protection node. The value must be of the STRING type.
             * *   **locationId:** The ID of the protection node. The value must be of the LONG type.
             */
            public Builder routingRules(String routingRules) {
                this.routingRules = routingRules;
                return this;
            }

            /**
             * Specifies whether to enable origin Server Name Indication (SNI). This parameter is available only if you specify **HttpsPorts**. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder sniEnabled(Boolean sniEnabled) {
                this.sniEnabled = sniEnabled;
                return this;
            }

            /**
             * The value of the SNI field. If you do not specify this parameter, the **Host** field value in the request header is used. If you want WAF to use an SNI field value that is different from the Host field value in back-to-origin requests, you can specify a custom value for the SNI field.
             * <p>
             * 
             * > You must specify this parameter only if you set **SniEnabled** to **true**.
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * The write timeout period. Unit: seconds. Valid values: 1 to 3600.
             */
            public Builder writeTimeout(Integer writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
}
