// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The position where the query stopped. If this parameter is not returned, all data is queried.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        private String serverGroupId;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public static final class Builder {
            private String serverGroupId; 

            /**
             * The ID of the server group to which requests are forwarded.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        private java.util.List < ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * The server group to which requests are forwarded.
             */
            public Builder serverGroupTuples(java.util.List < ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    public static class DefaultActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("Type")
        private String type;

        private DefaultActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultActions create() {
            return builder().build();
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private String type; 

            /**
             * The configuration of the forwarding rule action. This parameter is required and takes effect only when the type of the action is **FowardGroup**.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * The type of the task. If **ForwardGroup** is returned, requests are forwarded to multiple vServer groups.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DefaultActions build() {
                return new DefaultActions(this);
            } 

        } 

    }
    public static class AccessLogTracingConfig extends TeaModel {
        @NameInMap("TracingEnabled")
        private Boolean tracingEnabled;

        @NameInMap("TracingSample")
        private Integer tracingSample;

        @NameInMap("TracingType")
        private String tracingType;

        private AccessLogTracingConfig(Builder builder) {
            this.tracingEnabled = builder.tracingEnabled;
            this.tracingSample = builder.tracingSample;
            this.tracingType = builder.tracingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogTracingConfig create() {
            return builder().build();
        }

        /**
         * @return tracingEnabled
         */
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        /**
         * @return tracingSample
         */
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        /**
         * @return tracingType
         */
        public String getTracingType() {
            return this.tracingType;
        }

        public static final class Builder {
            private Boolean tracingEnabled; 
            private Integer tracingSample; 
            private String tracingType; 

            /**
             * Indicates whether Xtrace is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > You can set this parameter to **true** only if the access log feature is enabled by specifying **AccessLogEnabled**.
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * The sampling rate of Xtrace. Valid values: **1 to 10000**.
             * <p>
             * 
             * > This parameter takes effect only if **TracingEnabled** is set to **true**.
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * The Xtrace type. This parameter can be set to **Zipkin**.
             * <p>
             * 
             * > This parameter takes effect only if **TracingEnabled** is set to **true**.
             */
            public Builder tracingType(String tracingType) {
                this.tracingType = tracingType;
                return this;
            }

            public AccessLogTracingConfig build() {
                return new AccessLogTracingConfig(this);
            } 

        } 

    }
    public static class LogConfig extends TeaModel {
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        private Boolean accessLogRecordCustomizedHeadersEnabled;

        @NameInMap("AccessLogTracingConfig")
        private AccessLogTracingConfig accessLogTracingConfig;

        private LogConfig(Builder builder) {
            this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogTracingConfig = builder.accessLogTracingConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogConfig create() {
            return builder().build();
        }

        /**
         * @return accessLogRecordCustomizedHeadersEnabled
         */
        public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
            return this.accessLogRecordCustomizedHeadersEnabled;
        }

        /**
         * @return accessLogTracingConfig
         */
        public AccessLogTracingConfig getAccessLogTracingConfig() {
            return this.accessLogTracingConfig;
        }

        public static final class Builder {
            private Boolean accessLogRecordCustomizedHeadersEnabled; 
            private AccessLogTracingConfig accessLogTracingConfig; 

            /**
             * Indicates whether custom headers are carried in the access log. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
                this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
                return this;
            }

            /**
             * The configuration of Xtrace. Xtrace is used to record the requests sent to ALB.
             */
            public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
                this.accessLogTracingConfig = accessLogTracingConfig;
                return this;
            }

            public LogConfig build() {
                return new LogConfig(this);
            } 

        } 

    }
    public static class QuicConfig extends TeaModel {
        @NameInMap("QuicListenerId")
        private String quicListenerId;

        @NameInMap("QuicUpgradeEnabled")
        private Boolean quicUpgradeEnabled;

        private QuicConfig(Builder builder) {
            this.quicListenerId = builder.quicListenerId;
            this.quicUpgradeEnabled = builder.quicUpgradeEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuicConfig create() {
            return builder().build();
        }

        /**
         * @return quicListenerId
         */
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        /**
         * @return quicUpgradeEnabled
         */
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

        public static final class Builder {
            private String quicListenerId; 
            private Boolean quicUpgradeEnabled; 

            /**
             * The QUIC listener ID. This parameter is required when **QuicUpgradeEnabled** is set to **true**. Only HTTPS listeners support this parameter.
             * <p>
             * 
             * > You must add the HTTPS listener and the QUIC listener to the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.
             */
            public Builder quicListenerId(String quicListenerId) {
                this.quicListenerId = quicListenerId;
                return this;
            }

            /**
             * Indicates whether QUIC upgrade is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > Only HTTPS listeners support this parameter.
             */
            public Builder quicUpgradeEnabled(Boolean quicUpgradeEnabled) {
                this.quicUpgradeEnabled = quicUpgradeEnabled;
                return this;
            }

            public QuicConfig build() {
                return new QuicConfig(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class XForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        private String xForwardedForClientCertClientVerifyAlias;

        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        private Boolean xForwardedForClientCertClientVerifyEnabled;

        @NameInMap("XForwardedForClientCertFingerprintAlias")
        private String xForwardedForClientCertFingerprintAlias;

        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        private Boolean xForwardedForClientCertFingerprintEnabled;

        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        private String xForwardedForClientCertIssuerDNAlias;

        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        private Boolean xForwardedForClientCertIssuerDNEnabled;

        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        private String xForwardedForClientCertSubjectDNAlias;

        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        private Boolean xForwardedForClientCertSubjectDNEnabled;

        @NameInMap("XForwardedForClientSourceIpsEnabled")
        private Boolean xForwardedForClientSourceIpsEnabled;

        @NameInMap("XForwardedForClientSourceIpsTrusted")
        private String xForwardedForClientSourceIpsTrusted;

        @NameInMap("XForwardedForClientSrcPortEnabled")
        private Boolean xForwardedForClientSrcPortEnabled;

        @NameInMap("XForwardedForEnabled")
        private Boolean xForwardedForEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        private Boolean xForwardedForProtoEnabled;

        @NameInMap("XForwardedForSLBIdEnabled")
        private Boolean xForwardedForSLBIdEnabled;

        @NameInMap("XForwardedForSLBPortEnabled")
        private Boolean xForwardedForSLBPortEnabled;

        private XForwardedForConfig(Builder builder) {
            this.xForwardedForClientCertClientVerifyAlias = builder.xForwardedForClientCertClientVerifyAlias;
            this.xForwardedForClientCertClientVerifyEnabled = builder.xForwardedForClientCertClientVerifyEnabled;
            this.xForwardedForClientCertFingerprintAlias = builder.xForwardedForClientCertFingerprintAlias;
            this.xForwardedForClientCertFingerprintEnabled = builder.xForwardedForClientCertFingerprintEnabled;
            this.xForwardedForClientCertIssuerDNAlias = builder.xForwardedForClientCertIssuerDNAlias;
            this.xForwardedForClientCertIssuerDNEnabled = builder.xForwardedForClientCertIssuerDNEnabled;
            this.xForwardedForClientCertSubjectDNAlias = builder.xForwardedForClientCertSubjectDNAlias;
            this.xForwardedForClientCertSubjectDNEnabled = builder.xForwardedForClientCertSubjectDNEnabled;
            this.xForwardedForClientSourceIpsEnabled = builder.xForwardedForClientSourceIpsEnabled;
            this.xForwardedForClientSourceIpsTrusted = builder.xForwardedForClientSourceIpsTrusted;
            this.xForwardedForClientSrcPortEnabled = builder.xForwardedForClientSrcPortEnabled;
            this.xForwardedForEnabled = builder.xForwardedForEnabled;
            this.xForwardedForProtoEnabled = builder.xForwardedForProtoEnabled;
            this.xForwardedForSLBIdEnabled = builder.xForwardedForSLBIdEnabled;
            this.xForwardedForSLBPortEnabled = builder.xForwardedForSLBPortEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static XForwardedForConfig create() {
            return builder().build();
        }

        /**
         * @return xForwardedForClientCertClientVerifyAlias
         */
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.xForwardedForClientCertClientVerifyAlias;
        }

        /**
         * @return xForwardedForClientCertClientVerifyEnabled
         */
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.xForwardedForClientCertClientVerifyEnabled;
        }

        /**
         * @return xForwardedForClientCertFingerprintAlias
         */
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.xForwardedForClientCertFingerprintAlias;
        }

        /**
         * @return xForwardedForClientCertFingerprintEnabled
         */
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.xForwardedForClientCertFingerprintEnabled;
        }

        /**
         * @return xForwardedForClientCertIssuerDNAlias
         */
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.xForwardedForClientCertIssuerDNAlias;
        }

        /**
         * @return xForwardedForClientCertIssuerDNEnabled
         */
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.xForwardedForClientCertIssuerDNEnabled;
        }

        /**
         * @return xForwardedForClientCertSubjectDNAlias
         */
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.xForwardedForClientCertSubjectDNAlias;
        }

        /**
         * @return xForwardedForClientCertSubjectDNEnabled
         */
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.xForwardedForClientCertSubjectDNEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsEnabled
         */
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.xForwardedForClientSourceIpsEnabled;
        }

        /**
         * @return xForwardedForClientSourceIpsTrusted
         */
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.xForwardedForClientSourceIpsTrusted;
        }

        /**
         * @return xForwardedForClientSrcPortEnabled
         */
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.xForwardedForClientSrcPortEnabled;
        }

        /**
         * @return xForwardedForEnabled
         */
        public Boolean getXForwardedForEnabled() {
            return this.xForwardedForEnabled;
        }

        /**
         * @return xForwardedForProtoEnabled
         */
        public Boolean getXForwardedForProtoEnabled() {
            return this.xForwardedForProtoEnabled;
        }

        /**
         * @return xForwardedForSLBIdEnabled
         */
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.xForwardedForSLBIdEnabled;
        }

        /**
         * @return xForwardedForSLBPortEnabled
         */
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.xForwardedForSLBPortEnabled;
        }

        public static final class Builder {
            private String xForwardedForClientCertClientVerifyAlias; 
            private Boolean xForwardedForClientCertClientVerifyEnabled; 
            private String xForwardedForClientCertFingerprintAlias; 
            private Boolean xForwardedForClientCertFingerprintEnabled; 
            private String xForwardedForClientCertIssuerDNAlias; 
            private Boolean xForwardedForClientCertIssuerDNEnabled; 
            private String xForwardedForClientCertSubjectDNAlias; 
            private Boolean xForwardedForClientCertSubjectDNEnabled; 
            private Boolean xForwardedForClientSourceIpsEnabled; 
            private String xForwardedForClientSourceIpsTrusted; 
            private Boolean xForwardedForClientSrcPortEnabled; 
            private Boolean xForwardedForEnabled; 
            private Boolean xForwardedForProtoEnabled; 
            private Boolean xForwardedForSLBIdEnabled; 
            private Boolean xForwardedForSLBPortEnabled; 

            /**
             * The name of the custom header. This parameter takes effect only when **XForwardedForClientCertClientVerifyEnabled** is set to **true**.
             * <p>
             * 
             * The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertClientVerifyAlias(String xForwardedForClientCertClientVerifyAlias) {
                this.xForwardedForClientCertClientVerifyAlias = xForwardedForClientCertClientVerifyAlias;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Clientcert-clientverify` header is used to obtain the verification result of the client certificate. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertClientVerifyEnabled(Boolean xForwardedForClientCertClientVerifyEnabled) {
                this.xForwardedForClientCertClientVerifyEnabled = xForwardedForClientCertClientVerifyEnabled;
                return this;
            }

            /**
             * The name of the custom header. This parameter takes effect only when **XForwardedForClientCertFingerprintEnabled** is set to **true**.
             * <p>
             * 
             * The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertFingerprintAlias(String xForwardedForClientCertFingerprintAlias) {
                this.xForwardedForClientCertFingerprintAlias = xForwardedForClientCertFingerprintAlias;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Clientcert-fingerprint` header is used to retrieve the fingerprint of the client certificate. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertFingerprintEnabled(Boolean xForwardedForClientCertFingerprintEnabled) {
                this.xForwardedForClientCertFingerprintEnabled = xForwardedForClientCertFingerprintEnabled;
                return this;
            }

            /**
             * The name of the custom header. This parameter takes effect only when **XForwardedForClientCertIssuerDNEnabled** is set to **true**.
             * <p>
             * 
             * The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertIssuerDNAlias(String xForwardedForClientCertIssuerDNAlias) {
                this.xForwardedForClientCertIssuerDNAlias = xForwardedForClientCertIssuerDNAlias;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Clientcert-issuerdn` header is used to retrieve information about the authority that issues the client certificate. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertIssuerDNEnabled(Boolean xForwardedForClientCertIssuerDNEnabled) {
                this.xForwardedForClientCertIssuerDNEnabled = xForwardedForClientCertIssuerDNEnabled;
                return this;
            }

            /**
             * The name of the custom header. This parameter takes effect only when **XForwardedForClientCertSubjectDNEnabled** is set to **true**.
             * <p>
             * 
             * The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertSubjectDNAlias(String xForwardedForClientCertSubjectDNAlias) {
                this.xForwardedForClientCertSubjectDNAlias = xForwardedForClientCertSubjectDNAlias;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Clientcert-subjectdn` header is used to retrieve information about the owner of the client certificate. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder xForwardedForClientCertSubjectDNEnabled(Boolean xForwardedForClientCertSubjectDNEnabled) {
                this.xForwardedForClientCertSubjectDNEnabled = xForwardedForClientCertSubjectDNEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `X-Forwarded-Client-Ip` header to retrieve the source port of the ALB instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > HTTP, HTTPS, and QUIC listeners support this parameter.
             */
            public Builder xForwardedForClientSourceIpsEnabled(Boolean xForwardedForClientSourceIpsEnabled) {
                this.xForwardedForClientSourceIpsEnabled = xForwardedForClientSourceIpsEnabled;
                return this;
            }

            /**
             * The trusted proxy IP address.
             * <p>
             * 
             * ALB traverses `X-Forwarded-For` backward and selects the first IP address that is not in the trusted IP address list as the real IP address of the client. The IP address is used in source IP address throttling.
             */
            public Builder xForwardedForClientSourceIpsTrusted(String xForwardedForClientSourceIpsTrusted) {
                this.xForwardedForClientSourceIpsTrusted = xForwardedForClientSourceIpsTrusted;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Client-Port` header is used to retrieve the client port. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTP or HTTPS listener.
             */
            public Builder xForwardedForClientSrcPortEnabled(Boolean xForwardedForClientSrcPortEnabled) {
                this.xForwardedForClientSrcPortEnabled = xForwardedForClientSrcPortEnabled;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-For` header is used to retrieve the client IP address. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTP or HTTPS listener.
             */
            public Builder xForwardedForEnabled(Boolean xForwardedForEnabled) {
                this.xForwardedForEnabled = xForwardedForEnabled;
                return this;
            }

            /**
             * Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listener protocol of the ALB instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.
             */
            public Builder xForwardedForProtoEnabled(Boolean xForwardedForProtoEnabled) {
                this.xForwardedForProtoEnabled = xForwardedForProtoEnabled;
                return this;
            }

            /**
             * Indicates whether the `SLB-ID` header is used to retrieve the ID of the ALB instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.
             */
            public Builder xForwardedForSLBIdEnabled(Boolean xForwardedForSLBIdEnabled) {
                this.xForwardedForSLBIdEnabled = xForwardedForSLBIdEnabled;
                return this;
            }

            /**
             * Indicates whether the `X-Forwarded-Port` header is used to retrieve the listener port of the ALB instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.
             */
            public Builder xForwardedForSLBPortEnabled(Boolean xForwardedForSLBPortEnabled) {
                this.xForwardedForSLBPortEnabled = xForwardedForSLBPortEnabled;
                return this;
            }

            public XForwardedForConfig build() {
                return new XForwardedForConfig(this);
            } 

        } 

    }
    public static class Listeners extends TeaModel {
        @NameInMap("DefaultActions")
        private java.util.List < DefaultActions> defaultActions;

        @NameInMap("GzipEnabled")
        private Boolean gzipEnabled;

        @NameInMap("Http2Enabled")
        private Boolean http2Enabled;

        @NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @NameInMap("ListenerDescription")
        private String listenerDescription;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("ListenerStatus")
        private String listenerStatus;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("LogConfig")
        private LogConfig logConfig;

        @NameInMap("QuicConfig")
        private QuicConfig quicConfig;

        @NameInMap("RequestTimeout")
        private Integer requestTimeout;

        @NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("XForwardedForConfig")
        private XForwardedForConfig xForwardedForConfig;

        private Listeners(Builder builder) {
            this.defaultActions = builder.defaultActions;
            this.gzipEnabled = builder.gzipEnabled;
            this.http2Enabled = builder.http2Enabled;
            this.idleTimeout = builder.idleTimeout;
            this.listenerDescription = builder.listenerDescription;
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.listenerStatus = builder.listenerStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.logConfig = builder.logConfig;
            this.quicConfig = builder.quicConfig;
            this.requestTimeout = builder.requestTimeout;
            this.securityPolicyId = builder.securityPolicyId;
            this.tags = builder.tags;
            this.xForwardedForConfig = builder.xForwardedForConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return defaultActions
         */
        public java.util.List < DefaultActions> getDefaultActions() {
            return this.defaultActions;
        }

        /**
         * @return gzipEnabled
         */
        public Boolean getGzipEnabled() {
            return this.gzipEnabled;
        }

        /**
         * @return http2Enabled
         */
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerDescription
         */
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return listenerStatus
         */
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return logConfig
         */
        public LogConfig getLogConfig() {
            return this.logConfig;
        }

        /**
         * @return quicConfig
         */
        public QuicConfig getQuicConfig() {
            return this.quicConfig;
        }

        /**
         * @return requestTimeout
         */
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return xForwardedForConfig
         */
        public XForwardedForConfig getXForwardedForConfig() {
            return this.xForwardedForConfig;
        }

        public static final class Builder {
            private java.util.List < DefaultActions> defaultActions; 
            private Boolean gzipEnabled; 
            private Boolean http2Enabled; 
            private Integer idleTimeout; 
            private String listenerDescription; 
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String listenerStatus; 
            private String loadBalancerId; 
            private LogConfig logConfig; 
            private QuicConfig quicConfig; 
            private Integer requestTimeout; 
            private String securityPolicyId; 
            private java.util.List < Tags> tags; 
            private XForwardedForConfig xForwardedForConfig; 

            /**
             * The default actions in the forwarding rules.
             */
            public Builder defaultActions(java.util.List < DefaultActions> defaultActions) {
                this.defaultActions = defaultActions;
                return this;
            }

            /**
             * Indicates whether GZIP compression is enabled to compress specific types of files. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder gzipEnabled(Boolean gzipEnabled) {
                this.gzipEnabled = gzipEnabled;
                return this;
            }

            /**
             * Indicates whether HTTP/2 is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder http2Enabled(Boolean http2Enabled) {
                this.http2Enabled = http2Enabled;
                return this;
            }

            /**
             * The timeout period of an idle connection. Unit: seconds. Valid values: **1 to 60**.
             * <p>
             * 
             * If no request is received within the specified timeout period, ALB closes the connection. ALB establishes the connection again when a new connection request is received.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * The listener name.
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The frontend port that is used by the ALB instance. Valid values: **1 to 65535**.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listener protocol. Valid values:
             * <p>
             * 
             * *   **HTTP**
             * *   **HTTPS**
             * *   **QUIC**
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The status of the listener. Valid values:
             * <p>
             * 
             * *   **Provisioning**
             * *   **Running**
             * *   **Configuring**
             * *   **Stopped**
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
                return this;
            }

            /**
             * The ALB instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The configuration of logs.
             */
            public Builder logConfig(LogConfig logConfig) {
                this.logConfig = logConfig;
                return this;
            }

            /**
             * The configuration information when the listener is associated with a QUIC listener.
             */
            public Builder quicConfig(QuicConfig quicConfig) {
                this.quicConfig = quicConfig;
                return this;
            }

            /**
             * The timeout period of a request. Unit: seconds. Valid values: **1 to 180**.
             * <p>
             * 
             * If no responses are received from the backend server within the specified timeout period, ALB returns an `HTTP 504` error code to the client.
             */
            public Builder requestTimeout(Integer requestTimeout) {
                this.requestTimeout = requestTimeout;
                return this;
            }

            /**
             * The security policy.
             * <p>
             * 
             * > This parameter is available only when you create an HTTPS listener.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Configuration of the `XForward` header.
             */
            public Builder xForwardedForConfig(XForwardedForConfig xForwardedForConfig) {
                this.xForwardedForConfig = xForwardedForConfig;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
