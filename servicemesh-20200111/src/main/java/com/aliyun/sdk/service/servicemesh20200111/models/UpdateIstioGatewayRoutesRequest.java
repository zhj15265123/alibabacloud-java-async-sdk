// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIstioGatewayRoutesRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioGatewayRoutesRequest</p>
 */
public class UpdateIstioGatewayRoutesRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("GatewayRoute")
    private GatewayRoute gatewayRoute;

    @Body
    @NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @Body
    @NameInMap("Priority")
    private Integer priority;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Body
    @NameInMap("Status")
    private Integer status;

    private UpdateIstioGatewayRoutesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.gatewayRoute = builder.gatewayRoute;
        this.istioGatewayName = builder.istioGatewayName;
        this.priority = builder.priority;
        this.serviceMeshId = builder.serviceMeshId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioGatewayRoutesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gatewayRoute
     */
    public GatewayRoute getGatewayRoute() {
        return this.gatewayRoute;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateIstioGatewayRoutesRequest, Builder> {
        private String description; 
        private GatewayRoute gatewayRoute; 
        private String istioGatewayName; 
        private Integer priority; 
        private String serviceMeshId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioGatewayRoutesRequest request) {
            super(request);
            this.description = request.description;
            this.gatewayRoute = request.gatewayRoute;
            this.istioGatewayName = request.istioGatewayName;
            this.priority = request.priority;
            this.serviceMeshId = request.serviceMeshId;
            this.status = request.status;
        } 

        /**
         * The description of the routing rule.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The information about the routing rule to be updated for the ASM gateway.
         */
        public Builder gatewayRoute(GatewayRoute gatewayRoute) {
            String gatewayRouteShrink = shrink(gatewayRoute, "GatewayRoute", "json");
            this.putBodyParameter("GatewayRoute", gatewayRouteShrink);
            this.gatewayRoute = gatewayRoute;
            return this;
        }

        /**
         * The name of the ASM gateway.
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * The status of the routing rule. Valid values:
         * <p>
         * 
         * *   `0`: The routing rule is valid.
         * *   `1`: The routing rule is invalid.
         * *   `2`: An error occurs during the creation or update of the routing rule.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateIstioGatewayRoutesRequest build() {
            return new UpdateIstioGatewayRoutesRequest(this);
        } 

    } 

    public static class Delegate extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        private Delegate(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delegate create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 

            /**
             * The name of the virtual service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace to which the virtual service belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Delegate build() {
                return new Delegate(this);
            } 

        } 

    }
    public static class Percentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private Percentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Percentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Percentage build() {
                return new Percentage(this);
            } 

        } 

    }
    public static class Abort extends TeaModel {
        @NameInMap("HttpStatus")
        private Integer httpStatus;

        @NameInMap("Percentage")
        private Percentage percentage;

        private Abort(Builder builder) {
            this.httpStatus = builder.httpStatus;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Abort create() {
            return builder().build();
        }

        /**
         * @return httpStatus
         */
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return percentage
         */
        public Percentage getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private Integer httpStatus; 
            private Percentage percentage; 

            /**
             * The HTTP status code.
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * The percentage of requests that are aborted with the specified error code.
             */
            public Builder percentage(Percentage percentage) {
                this.percentage = percentage;
                return this;
            }

            public Abort build() {
                return new Abort(this);
            } 

        } 

    }
    public static class DelayPercentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private DelayPercentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayPercentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests to which the delay fault is injected, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public DelayPercentage build() {
                return new DelayPercentage(this);
            } 

        } 

    }
    public static class Delay extends TeaModel {
        @NameInMap("FixedDelay")
        private String fixedDelay;

        @NameInMap("Percentage")
        private DelayPercentage percentage;

        private Delay(Builder builder) {
            this.fixedDelay = builder.fixedDelay;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delay create() {
            return builder().build();
        }

        /**
         * @return fixedDelay
         */
        public String getFixedDelay() {
            return this.fixedDelay;
        }

        /**
         * @return percentage
         */
        public DelayPercentage getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String fixedDelay; 
            private DelayPercentage percentage; 

            /**
             * The fixed duration for request delay.
             */
            public Builder fixedDelay(String fixedDelay) {
                this.fixedDelay = fixedDelay;
                return this;
            }

            /**
             * The percentage of requests to which the delay fault is injected.
             */
            public Builder percentage(DelayPercentage percentage) {
                this.percentage = percentage;
                return this;
            }

            public Delay build() {
                return new Delay(this);
            } 

        } 

    }
    public static class Fault extends TeaModel {
        @NameInMap("Abort")
        private Abort abort;

        @NameInMap("Delay")
        private Delay delay;

        private Fault(Builder builder) {
            this.abort = builder.abort;
            this.delay = builder.delay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fault create() {
            return builder().build();
        }

        /**
         * @return abort
         */
        public Abort getAbort() {
            return this.abort;
        }

        /**
         * @return delay
         */
        public Delay getDelay() {
            return this.delay;
        }

        public static final class Builder {
            private Abort abort; 
            private Delay delay; 

            /**
             * The configurations for aborting requests with specified error codes.
             */
            public Builder abort(Abort abort) {
                this.abort = abort;
                return this;
            }

            /**
             * The duration to delay a request.
             */
            public Builder delay(Delay delay) {
                this.delay = delay;
                return this;
            }

            public Fault build() {
                return new Fault(this);
            } 

        } 

    }
    public static class HTTPRedirect extends TeaModel {
        @NameInMap("Authority")
        private String authority;

        @NameInMap("RedirectCode")
        private Integer redirectCode;

        @NameInMap("Uri")
        private String uri;

        private HTTPRedirect(Builder builder) {
            this.authority = builder.authority;
            this.redirectCode = builder.redirectCode;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPRedirect create() {
            return builder().build();
        }

        /**
         * @return authority
         */
        public String getAuthority() {
            return this.authority;
        }

        /**
         * @return redirectCode
         */
        public Integer getRedirectCode() {
            return this.redirectCode;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String authority; 
            private Integer redirectCode; 
            private String uri; 

            /**
             * The value to be used to overwrite the value of the Authority or Host header during redirection.
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * The HTTP status code to be used to indicate URL redirection. Default value: 301.
             */
            public Builder redirectCode(Integer redirectCode) {
                this.redirectCode = redirectCode;
                return this;
            }

            /**
             * The value to be used to overwrite the URL path during redirection.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public HTTPRedirect build() {
                return new HTTPRedirect(this);
            } 

        } 

    }
    public static class Mirror extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Subset")
        private String subset;

        private Mirror(Builder builder) {
            this.host = builder.host;
            this.subset = builder.subset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mirror create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return subset
         */
        public String getSubset() {
            return this.subset;
        }

        public static final class Builder {
            private String host; 
            private String subset; 

            /**
             * The name of the service defined in the service registry.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The name of the service subset.
             */
            public Builder subset(String subset) {
                this.subset = subset;
                return this;
            }

            public Mirror build() {
                return new Mirror(this);
            } 

        } 

    }
    public static class MirrorPercentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private MirrorPercentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorPercentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests that are mirrored to another destination except for the original destination, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MirrorPercentage build() {
                return new MirrorPercentage(this);
            } 

        } 

    }
    public static class RetryRemoteLocalities extends TeaModel {
        @NameInMap("Value")
        private Boolean value;

        private RetryRemoteLocalities(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryRemoteLocalities create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Boolean getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean value; 

            /**
             * Specifies whether to allow retries to other localities. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             * 
             * Default value: `false`.
             */
            public Builder value(Boolean value) {
                this.value = value;
                return this;
            }

            public RetryRemoteLocalities build() {
                return new RetryRemoteLocalities(this);
            } 

        } 

    }
    public static class Retries extends TeaModel {
        @NameInMap("Attempts")
        private Integer attempts;

        @NameInMap("PerTryTimeout")
        private String perTryTimeout;

        @NameInMap("RetryOn")
        private String retryOn;

        @NameInMap("RetryRemoteLocalities")
        private RetryRemoteLocalities retryRemoteLocalities;

        private Retries(Builder builder) {
            this.attempts = builder.attempts;
            this.perTryTimeout = builder.perTryTimeout;
            this.retryOn = builder.retryOn;
            this.retryRemoteLocalities = builder.retryRemoteLocalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Retries create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return perTryTimeout
         */
        public String getPerTryTimeout() {
            return this.perTryTimeout;
        }

        /**
         * @return retryOn
         */
        public String getRetryOn() {
            return this.retryOn;
        }

        /**
         * @return retryRemoteLocalities
         */
        public RetryRemoteLocalities getRetryRemoteLocalities() {
            return this.retryRemoteLocalities;
        }

        public static final class Builder {
            private Integer attempts; 
            private String perTryTimeout; 
            private String retryOn; 
            private RetryRemoteLocalities retryRemoteLocalities; 

            /**
             * The number of retries allowed for a request.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * The timeout period for each retry.
             */
            public Builder perTryTimeout(String perTryTimeout) {
                this.perTryTimeout = perTryTimeout;
                return this;
            }

            /**
             * The condition for retries. Example: `connect-failure,refused-stream,503`.
             */
            public Builder retryOn(String retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * Specifies whether to allow retries to other localities.
             */
            public Builder retryRemoteLocalities(RetryRemoteLocalities retryRemoteLocalities) {
                this.retryRemoteLocalities = retryRemoteLocalities;
                return this;
            }

            public Retries build() {
                return new Retries(this);
            } 

        } 

    }
    public static class Rewrite extends TeaModel {
        @NameInMap("Authority")
        private String authority;

        @NameInMap("Uri")
        private String uri;

        private Rewrite(Builder builder) {
            this.authority = builder.authority;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rewrite create() {
            return builder().build();
        }

        /**
         * @return authority
         */
        public String getAuthority() {
            return this.authority;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String authority; 
            private String uri; 

            /**
             * The value to be used to overwrite the value of the Authority or Host header.
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * The value to be used to overwrite the path or prefix of the URI.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Rewrite build() {
                return new Rewrite(this);
            } 

        } 

    }
    public static class HTTPAdvancedOptions extends TeaModel {
        @NameInMap("Delegate")
        private Delegate delegate;

        @NameInMap("Fault")
        private Fault fault;

        @NameInMap("HTTPRedirect")
        private HTTPRedirect HTTPRedirect;

        @NameInMap("Mirror")
        private Mirror mirror;

        @NameInMap("MirrorPercentage")
        private MirrorPercentage mirrorPercentage;

        @NameInMap("Retries")
        private Retries retries;

        @NameInMap("Rewrite")
        private Rewrite rewrite;

        @NameInMap("Timeout")
        private String timeout;

        private HTTPAdvancedOptions(Builder builder) {
            this.delegate = builder.delegate;
            this.fault = builder.fault;
            this.HTTPRedirect = builder.HTTPRedirect;
            this.mirror = builder.mirror;
            this.mirrorPercentage = builder.mirrorPercentage;
            this.retries = builder.retries;
            this.rewrite = builder.rewrite;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPAdvancedOptions create() {
            return builder().build();
        }

        /**
         * @return delegate
         */
        public Delegate getDelegate() {
            return this.delegate;
        }

        /**
         * @return fault
         */
        public Fault getFault() {
            return this.fault;
        }

        /**
         * @return HTTPRedirect
         */
        public HTTPRedirect getHTTPRedirect() {
            return this.HTTPRedirect;
        }

        /**
         * @return mirror
         */
        public Mirror getMirror() {
            return this.mirror;
        }

        /**
         * @return mirrorPercentage
         */
        public MirrorPercentage getMirrorPercentage() {
            return this.mirrorPercentage;
        }

        /**
         * @return retries
         */
        public Retries getRetries() {
            return this.retries;
        }

        /**
         * @return rewrite
         */
        public Rewrite getRewrite() {
            return this.rewrite;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Delegate delegate; 
            private Fault fault; 
            private HTTPRedirect HTTPRedirect; 
            private Mirror mirror; 
            private MirrorPercentage mirrorPercentage; 
            private Retries retries; 
            private Rewrite rewrite; 
            private String timeout; 

            /**
             * The virtual service that defines traffic routing.
             */
            public Builder delegate(Delegate delegate) {
                this.delegate = delegate;
                return this;
            }

            /**
             * The configurations of fault injection.
             */
            public Builder fault(Fault fault) {
                this.fault = fault;
                return this;
            }

            /**
             * The HTTP redirection rule.
             */
            public Builder HTTPRedirect(HTTPRedirect HTTPRedirect) {
                this.HTTPRedirect = HTTPRedirect;
                return this;
            }

            /**
             * The configurations for mirroring HTTP traffic to another destination in addition to forwarding requests to the specified destination.
             */
            public Builder mirror(Mirror mirror) {
                this.mirror = mirror;
                return this;
            }

            /**
             * The percentage of requests that are mirrored to another destination except for the original destination.
             */
            public Builder mirrorPercentage(MirrorPercentage mirrorPercentage) {
                this.mirrorPercentage = mirrorPercentage;
                return this;
            }

            /**
             * The configurations of retries for failed requests.
             */
            public Builder retries(Retries retries) {
                this.retries = retries;
                return this;
            }

            /**
             * The configurations for rewriting the virtual service.
             */
            public Builder rewrite(Rewrite rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            /**
             * The timeout period for requests.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            public HTTPAdvancedOptions build() {
                return new HTTPAdvancedOptions(this);
            } 

        } 

    }
    public static class Headers extends TeaModel {
        @NameInMap("MatchingContent")
        private String matchingContent;

        @NameInMap("MatchingMode")
        private String matchingMode;

        @NameInMap("Name")
        private String name;

        private Headers(Builder builder) {
            this.matchingContent = builder.matchingContent;
            this.matchingMode = builder.matchingMode;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return matchingContent
         */
        public String getMatchingContent() {
            return this.matchingContent;
        }

        /**
         * @return matchingMode
         */
        public String getMatchingMode() {
            return this.matchingMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String matchingContent; 
            private String matchingMode; 
            private String name; 

            /**
             * The header value to be matched.
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * The matching mode for the header value. Valid values:
             * <p>
             * 
             * *   `exact`: exact match
             * *   `prefix`: match by prefix
             * *   `regex`: match by regular expression
             */
            public Builder matchingMode(String matchingMode) {
                this.matchingMode = matchingMode;
                return this;
            }

            /**
             * The header key to be matched.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class TLSMatchAttributes extends TeaModel {
        @NameInMap("SNIHosts")
        private java.util.List < String > SNIHosts;

        @NameInMap("TLSPort")
        private Integer TLSPort;

        private TLSMatchAttributes(Builder builder) {
            this.SNIHosts = builder.SNIHosts;
            this.TLSPort = builder.TLSPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TLSMatchAttributes create() {
            return builder().build();
        }

        /**
         * @return SNIHosts
         */
        public java.util.List < String > getSNIHosts() {
            return this.SNIHosts;
        }

        /**
         * @return TLSPort
         */
        public Integer getTLSPort() {
            return this.TLSPort;
        }

        public static final class Builder {
            private java.util.List < String > SNIHosts; 
            private Integer TLSPort; 

            /**
             * The Server Name Indication (SNI) values to be matched.
             */
            public Builder SNIHosts(java.util.List < String > SNIHosts) {
                this.SNIHosts = SNIHosts;
                return this;
            }

            /**
             * The TLS port.
             */
            public Builder TLSPort(Integer TLSPort) {
                this.TLSPort = TLSPort;
                return this;
            }

            public TLSMatchAttributes build() {
                return new TLSMatchAttributes(this);
            } 

        } 

    }
    public static class URI extends TeaModel {
        @NameInMap("MatchingContent")
        private String matchingContent;

        @NameInMap("MatchingMode")
        private String matchingMode;

        private URI(Builder builder) {
            this.matchingContent = builder.matchingContent;
            this.matchingMode = builder.matchingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static URI create() {
            return builder().build();
        }

        /**
         * @return matchingContent
         */
        public String getMatchingContent() {
            return this.matchingContent;
        }

        /**
         * @return matchingMode
         */
        public String getMatchingMode() {
            return this.matchingMode;
        }

        public static final class Builder {
            private String matchingContent; 
            private String matchingMode; 

            /**
             * The content to be matched.
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * The matching mode for the routing rule. Valid values:
             * <p>
             * 
             * *   `exact`: exact match
             * *   `prefix`: match by prefix
             * *   `regex`: match by regular expression
             */
            public Builder matchingMode(String matchingMode) {
                this.matchingMode = matchingMode;
                return this;
            }

            public URI build() {
                return new URI(this);
            } 

        } 

    }
    public static class MatchRequest extends TeaModel {
        @NameInMap("Headers")
        private java.util.List < Headers> headers;

        @NameInMap("Ports")
        private java.util.List < Integer > ports;

        @NameInMap("TLSMatchAttributes")
        private java.util.List < TLSMatchAttributes> TLSMatchAttributes;

        @NameInMap("URI")
        private URI URI;

        private MatchRequest(Builder builder) {
            this.headers = builder.headers;
            this.ports = builder.ports;
            this.TLSMatchAttributes = builder.TLSMatchAttributes;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchRequest create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List < Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return TLSMatchAttributes
         */
        public java.util.List < TLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        /**
         * @return URI
         */
        public URI getURI() {
            return this.URI;
        }

        public static final class Builder {
            private java.util.List < Headers> headers; 
            private java.util.List < Integer > ports; 
            private java.util.List < TLSMatchAttributes> TLSMatchAttributes; 
            private URI URI; 

            /**
             * The request headers to be matched.
             */
            public Builder headers(java.util.List < Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * The ports.
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The matching rule for Transport Layer Security (TLS) traffic.
             */
            public Builder TLSMatchAttributes(java.util.List < TLSMatchAttributes> TLSMatchAttributes) {
                this.TLSMatchAttributes = TLSMatchAttributes;
                return this;
            }

            /**
             * The matching rule for URIs.
             */
            public Builder URI(URI URI) {
                this.URI = URI;
                return this;
            }

            public MatchRequest build() {
                return new MatchRequest(this);
            } 

        } 

    }
    public static class Port extends TeaModel {
        @NameInMap("Number")
        private Integer number;

        private Port(Builder builder) {
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Port create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        public static final class Builder {
            private Integer number; 

            /**
             * Number.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            public Port build() {
                return new Port(this);
            } 

        } 

    }
    public static class Destination extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
        private Port port;

        @NameInMap("Subset")
        private String subset;

        private Destination(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
            this.subset = builder.subset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destination create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Port getPort() {
            return this.port;
        }

        /**
         * @return subset
         */
        public String getSubset() {
            return this.subset;
        }

        public static final class Builder {
            private String host; 
            private Port port; 
            private String subset; 

            /**
             * The name of the service defined in the service registry.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Port port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the service subset.
             */
            public Builder subset(String subset) {
                this.subset = subset;
                return this;
            }

            public Destination build() {
                return new Destination(this);
            } 

        } 

    }
    public static class RouteDestinations extends TeaModel {
        @NameInMap("Destination")
        private Destination destination;

        @NameInMap("Weight")
        private Integer weight;

        private RouteDestinations(Builder builder) {
            this.destination = builder.destination;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteDestinations create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public Destination getDestination() {
            return this.destination;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Destination destination; 
            private Integer weight; 

            /**
             * The unique endpoint of the destination service to which the specified requests are sent.
             */
            public Builder destination(Destination destination) {
                this.destination = destination;
                return this;
            }

            /**
             * The weight of the service subset.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public RouteDestinations build() {
                return new RouteDestinations(this);
            } 

        } 

    }
    public static class GatewayRoute extends TeaModel {
        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("HTTPAdvancedOptions")
        private HTTPAdvancedOptions HTTPAdvancedOptions;

        @NameInMap("MatchRequest")
        private MatchRequest matchRequest;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RawVSRoute")
        private Object rawVSRoute;

        @NameInMap("RouteDestinations")
        private java.util.List < RouteDestinations> routeDestinations;

        @NameInMap("RouteName")
        private String routeName;

        @NameInMap("RouteType")
        private String routeType;

        private GatewayRoute(Builder builder) {
            this.domains = builder.domains;
            this.HTTPAdvancedOptions = builder.HTTPAdvancedOptions;
            this.matchRequest = builder.matchRequest;
            this.namespace = builder.namespace;
            this.rawVSRoute = builder.rawVSRoute;
            this.routeDestinations = builder.routeDestinations;
            this.routeName = builder.routeName;
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayRoute create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
        }

        /**
         * @return HTTPAdvancedOptions
         */
        public HTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        /**
         * @return matchRequest
         */
        public MatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return rawVSRoute
         */
        public Object getRawVSRoute() {
            return this.rawVSRoute;
        }

        /**
         * @return routeDestinations
         */
        public java.util.List < RouteDestinations> getRouteDestinations() {
            return this.routeDestinations;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        public static final class Builder {
            private java.util.List < String > domains; 
            private HTTPAdvancedOptions HTTPAdvancedOptions; 
            private MatchRequest matchRequest; 
            private String namespace; 
            private Object rawVSRoute; 
            private java.util.List < RouteDestinations> routeDestinations; 
            private String routeName; 
            private String routeType; 

            /**
             * Domains.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The advanced settings for routing HTTP traffic.
             */
            public Builder HTTPAdvancedOptions(HTTPAdvancedOptions HTTPAdvancedOptions) {
                this.HTTPAdvancedOptions = HTTPAdvancedOptions;
                return this;
            }

            /**
             * The matching rules for traffic routing.
             */
            public Builder matchRequest(MatchRequest matchRequest) {
                this.matchRequest = matchRequest;
                return this;
            }

            /**
             * The namespace in which the destination service resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RawVSRoute.
             */
            public Builder rawVSRoute(Object rawVSRoute) {
                this.rawVSRoute = rawVSRoute;
                return this;
            }

            /**
             * The endpoints of destination services for Layer 4 weighted routing.
             */
            public Builder routeDestinations(java.util.List < RouteDestinations> routeDestinations) {
                this.routeDestinations = routeDestinations;
                return this;
            }

            /**
             * The name of the routing rule.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * The type of the traffic to be routed. Valid values: `HTTP`, `TLS`, and `TCP`.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            public GatewayRoute build() {
                return new GatewayRoute(this);
            } 

        } 

    }
}
