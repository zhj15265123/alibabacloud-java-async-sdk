// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudResourcesResponseBody</p>
 */
public class DescribeHybridCloudResourcesResponseBody extends TeaModel {
    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeHybridCloudResourcesResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Domains> domains; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The domain names.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudResourcesResponseBody build() {
            return new DescribeHybridCloudResourcesResponseBody(this);
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
        private java.util.List < Long > httpPorts;

        @NameInMap("HttpsPorts")
        private java.util.List < Long > httpsPorts;

        @NameInMap("Ipv6Enabled")
        private Boolean ipv6Enabled;

        @NameInMap("ProtectionResource")
        private String protectionResource;

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
            this.ipv6Enabled = builder.ipv6Enabled;
            this.protectionResource = builder.protectionResource;
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
        public java.util.List < Long > getHttpPorts() {
            return this.httpPorts;
        }

        /**
         * @return httpsPorts
         */
        public java.util.List < Long > getHttpsPorts() {
            return this.httpsPorts;
        }

        /**
         * @return ipv6Enabled
         */
        public Boolean getIpv6Enabled() {
            return this.ipv6Enabled;
        }

        /**
         * @return protectionResource
         */
        public String getProtectionResource() {
            return this.protectionResource;
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
            private java.util.List < Long > httpPorts; 
            private java.util.List < Long > httpsPorts; 
            private Boolean ipv6Enabled; 
            private String protectionResource; 
            private String TLSVersion; 
            private Integer xffHeaderMode; 
            private java.util.List < String > xffHeaders; 

            /**
             * The ID of the certificate.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * The types of cipher suites that are added. Valid values:
             * <p>
             * 
             * *   **1:** all cipher suites.
             * *   **2:** strong cipher suites.
             * *   **99:** custom cipher suites.
             */
            public Builder cipherSuite(Integer cipherSuite) {
                this.cipherSuite = cipherSuite;
                return this;
            }

            /**
             * The custom cipher suites.
             * <p>
             * 
             * > This parameter is returned only if the value of **CipherSuite** is **99**.
             */
            public Builder customCiphers(java.util.List < String > customCiphers) {
                this.customCiphers = customCiphers;
                return this;
            }

            /**
             * Indicates whether TLS 1.3 is supported. Valid values:
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
             * Indicates whether exclusive IP addresses are supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder exclusiveIp(Boolean exclusiveIp) {
                this.exclusiveIp = exclusiveIp;
                return this;
            }

            /**
             * Indicates whether the HTTP to HTTPS redirection feature is enabled for the domain name. Valid values:
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
             * Indicates whether HTTP/2 is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * The HTTP listener ports.
             */
            public Builder httpPorts(java.util.List < Long > httpPorts) {
                this.httpPorts = httpPorts;
                return this;
            }

            /**
             * The HTTPS listener ports.
             */
            public Builder httpsPorts(java.util.List < Long > httpsPorts) {
                this.httpsPorts = httpsPorts;
                return this;
            }

            /**
             * Indicates whether IPv6 is supported. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ipv6Enabled(Boolean ipv6Enabled) {
                this.ipv6Enabled = ipv6Enabled;
                return this;
            }

            /**
             * The type of the protection resource. Valid values:
             * <p>
             * 
             * *   **share:** shared cluster.
             * *   **gslb:** shared cluster-based intelligent load balancing.
             */
            public Builder protectionResource(String protectionResource) {
                this.protectionResource = protectionResource;
                return this;
            }

            /**
             * The version of the Transport Layer Security (TLS) protocol. Valid values:
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
             * The method that is used to obtain the actual IP address of a client. Valid values:
             * <p>
             * 
             * *   **0:** No Layer 7 proxies are deployed in front of WAF.
             * *   **1:** WAF reads the first value of the X-Forwarded-For (XFF) header field as the actual IP address of the client.
             * *   **2:** WAF reads the value of a custom header field as the actual IP address of the client.
             */
            public Builder xffHeaderMode(Integer xffHeaderMode) {
                this.xffHeaderMode = xffHeaderMode;
                return this;
            }

            /**
             * The custom header fields that are used to obtain the actual IP address of a client. The value is in the \["header1","header2",...] format.
             * <p>
             * 
             * > This parameter is returned only if the value of **XffHeaderMode** is 2.
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
        private Long connectTimeout;

        @NameInMap("FocusHttpBackend")
        private Boolean focusHttpBackend;

        @NameInMap("Keepalive")
        private Boolean keepalive;

        @NameInMap("KeepaliveRequests")
        private Long keepaliveRequests;

        @NameInMap("KeepaliveTimeout")
        private Long keepaliveTimeout;

        @NameInMap("Loadbalance")
        private String loadbalance;

        @NameInMap("ReadTimeout")
        private Long readTimeout;

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
        private Long writeTimeout;

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
        public Long getConnectTimeout() {
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
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Long getKeepaliveTimeout() {
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
        public Long getReadTimeout() {
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
        public Long getWriteTimeout() {
            return this.writeTimeout;
        }

        public static final class Builder {
            private java.util.List < String > backends; 
            private Boolean cnameEnabled; 
            private Long connectTimeout; 
            private Boolean focusHttpBackend; 
            private Boolean keepalive; 
            private Long keepaliveRequests; 
            private Long keepaliveTimeout; 
            private String loadbalance; 
            private Long readTimeout; 
            private java.util.List < RequestHeaders> requestHeaders; 
            private Boolean retry; 
            private String routingRules; 
            private Boolean sniEnabled; 
            private String sniHost; 
            private Long writeTimeout; 

            /**
             * The back-to-origin IP addresses or domain names.
             */
            public Builder backends(java.util.List < String > backends) {
                this.backends = backends;
                return this;
            }

            /**
             * Indicates whether the public cloud disaster recovery feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder cnameEnabled(Boolean cnameEnabled) {
                this.cnameEnabled = cnameEnabled;
                return this;
            }

            /**
             * The connection timeout period. Unit: seconds. Valid values: 5 to 120.
             */
            public Builder connectTimeout(Long connectTimeout) {
                this.connectTimeout = connectTimeout;
                return this;
            }

            /**
             * Indicates whether the HTTPS to HTTP redirection feature is enabled for back-to-origin requests. Valid values:
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
             * Indicates whether the persistent connection feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
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
             * > This parameter indicates the number of reused persistent connections after you enable the persistent connection feature.
             */
            public Builder keepaliveRequests(Long keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * The timeout period of persistent connections that are in the Idle state. Unit: seconds. Valid values: 1 to 60. Default value: 15.
             * <p>
             * 
             * > This parameter indicates the period of time during which a reused persistent connection is allowed to remain in the Idle state before the persistent connection is released.
             */
            public Builder keepaliveTimeout(Long keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * The load balancing algorithm that WAF uses to forward requests to the origin server. Valid values:
             * <p>
             * 
             * *   **ip_hash**
             * *   **roundRobin**
             * *   **leastTime**
             */
            public Builder loadbalance(String loadbalance) {
                this.loadbalance = loadbalance;
                return this;
            }

            /**
             * The read timeout period. Unit: seconds. Valid values: 5 to 1800.
             */
            public Builder readTimeout(Long readTimeout) {
                this.readTimeout = readTimeout;
                return this;
            }

            /**
             * The key-value pair that is used to mark the requests that pass through the WAF instance.
             */
            public Builder requestHeaders(java.util.List < RequestHeaders> requestHeaders) {
                this.requestHeaders = requestHeaders;
                return this;
            }

            /**
             * Indicates whether WAF retries to forward requests when requests fail to be forwarded to the origin server. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * The forwarding rules that you configured for the domain name that you added to WAF in hybrid cloud mode. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:
             * <p>
             * 
             * *   **rs:** The back-to-origin IP addresses or CNAMEs. The value is of the ARRAY type.
             * *   **location:** The name of the protection node. The value is of the STRING type.
             * *   **locationId:** The ID of the protection node. The value is of the LONG type.
             */
            public Builder routingRules(String routingRules) {
                this.routingRules = routingRules;
                return this;
            }

            /**
             * Indicates whether the origin Server Name Indication (SNI) feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder sniEnabled(Boolean sniEnabled) {
                this.sniEnabled = sniEnabled;
                return this;
            }

            /**
             * The value of the custom Server Name Indication (SNI) field. If the parameter is left empty, the value of the **Host** field in the request header is automatically used as the value of the SNI field.
             * <p>
             * 
             * > This parameter is returned only if the value of **SniEnabled** is **true**.
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * The write timeout period. Unit: seconds. Valid values: 5 to 1800.
             */
            public Builder writeTimeout(Long writeTimeout) {
                this.writeTimeout = writeTimeout;
                return this;
            }

            public Redirect build() {
                return new Redirect(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Listen")
        private Listen listen;

        @NameInMap("Redirect")
        private Redirect redirect;

        @NameInMap("ResourceManagerResourceGroupId")
        private String resourceManagerResourceGroupId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uid")
        private String uid;

        private Domains(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.id = builder.id;
            this.listen = builder.listen;
            this.redirect = builder.redirect;
            this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
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
         * @return resourceManagerResourceGroupId
         */
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private Long id; 
            private Listen listen; 
            private Redirect redirect; 
            private String resourceManagerResourceGroupId; 
            private Integer status; 
            private String uid; 

            /**
             * The CNAME that is assigned by WAF to the domain name.
             * <p>
             * 
             * > This parameter is returned only if you set **CnameEnabled** to true.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The access ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The configurations of the listeners.
             */
            public Builder listen(Listen listen) {
                this.listen = listen;
                return this;
            }

            /**
             * The configurations of the forwarding rule.
             */
            public Builder redirect(Redirect redirect) {
                this.redirect = redirect;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
                this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
                return this;
            }

            /**
             * The status of the domain name. Valid values:
             * <p>
             * 
             * *   **1:** The domain name is normal.
             * *   **2:** The domain name is being created.
             * *   **3:** The domain name is being modified.
             * *   **4:** The domain name is being released.
             * *   **5:** WAF no longer forwards traffic of the domain name.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The user ID.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
