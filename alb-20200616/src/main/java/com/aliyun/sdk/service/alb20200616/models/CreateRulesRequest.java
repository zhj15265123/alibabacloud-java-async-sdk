// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateRulesRequest</p>
 */
public class CreateRulesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private java.util.List < Rules> rules;

    private CreateRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 
        private java.util.List < Rules> rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
            this.rules = request.rules;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The listener ID of the ALB instance.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The direction to which the forwarding rule is applied. You can specify only one direction. Valid values:
         * <p>
         * 
         * *   **Request** (default): The forwarding rule is applied to the client requests received by ALB.
         * *   **Response**: The forwarding rule is applied to the responses returned by backend servers.
         * 
         * > Basic ALB instances do not support the **Response** value.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateRulesRequest build() {
            return new CreateRulesRequest(this);
        } 

    } 

    public static class CorsConfig extends TeaModel {
        @NameInMap("AllowCredentials")
        private String allowCredentials;

        @NameInMap("AllowHeaders")
        private java.util.List < String > allowHeaders;

        @NameInMap("AllowMethods")
        private java.util.List < String > allowMethods;

        @NameInMap("AllowOrigin")
        private java.util.List < String > allowOrigin;

        @NameInMap("ExposeHeaders")
        private java.util.List < String > exposeHeaders;

        @NameInMap("MaxAge")
        private Long maxAge;

        private CorsConfig(Builder builder) {
            this.allowCredentials = builder.allowCredentials;
            this.allowHeaders = builder.allowHeaders;
            this.allowMethods = builder.allowMethods;
            this.allowOrigin = builder.allowOrigin;
            this.exposeHeaders = builder.exposeHeaders;
            this.maxAge = builder.maxAge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorsConfig create() {
            return builder().build();
        }

        /**
         * @return allowCredentials
         */
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        /**
         * @return allowHeaders
         */
        public java.util.List < String > getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public java.util.List < String > getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigin
         */
        public java.util.List < String > getAllowOrigin() {
            return this.allowOrigin;
        }

        /**
         * @return exposeHeaders
         */
        public java.util.List < String > getExposeHeaders() {
            return this.exposeHeaders;
        }

        /**
         * @return maxAge
         */
        public Long getMaxAge() {
            return this.maxAge;
        }

        public static final class Builder {
            private String allowCredentials; 
            private java.util.List < String > allowHeaders; 
            private java.util.List < String > allowMethods; 
            private java.util.List < String > allowOrigin; 
            private java.util.List < String > exposeHeaders; 
            private Long maxAge; 

            /**
             * The key of the header.
             * <p>
             * 
             * *   The key must be 1 to 40 characters in length.
             * *   It can contain letters, digits, hyphens (-), and underscores (\_).
             * *   You cannot set Cookie or Host.
             */
            public Builder allowCredentials(String allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * AllowHeaders.
             */
            public Builder allowHeaders(java.util.List < String > allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * AllowMethods.
             */
            public Builder allowMethods(java.util.List < String > allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * AllowOrigin.
             */
            public Builder allowOrigin(java.util.List < String > allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * ExposeHeaders.
             */
            public Builder exposeHeaders(java.util.List < String > exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
                return this;
            }

            /**
             * The value of the header. The header values within a forwarding rule must be unique.
             * <p>
             * 
             * *   The value must be 1 to 128 characters in length.
             * *   It can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcard characters.
             * *   The value cannot start or end with a space character.
             */
            public Builder maxAge(Long maxAge) {
                this.maxAge = maxAge;
                return this;
            }

            public CorsConfig build() {
                return new CorsConfig(this);
            } 

        } 

    }
    public static class FixedResponseConfig extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("HttpCode")
        private String httpCode;

        private FixedResponseConfig(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.httpCode = builder.httpCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FixedResponseConfig create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private String httpCode; 

            /**
             * The weight of the server group. A larger value indicates a higher weight. A server group with a higher weight receives more requests. Valid values: **1 to 100**. Default value: **100**.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Specifies whether to enable session persistence. Valid values:
             * <p>
             * 
             * *   **true**: enables session persistence.
             * *   **false** (default): disables session persistence.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The timeout period of sessions. Unit: seconds. Valid values: **1 to 86400**.
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            public FixedResponseConfig build() {
                return new FixedResponseConfig(this);
            } 

        } 

    }
    public static class ServerGroupStickySession extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("Timeout")
        private Integer timeout;

        private ServerGroupStickySession(Builder builder) {
            this.enabled = builder.enabled;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupStickySession create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer timeout; 

            /**
             * The type of header. Valid values:
             * <p>
             * 
             * *   **UserDefined**: a custom header.
             * *   **ReferenceHeader**: a header that is referenced from one of the request headers.
             * *   **SystemDefined**: a header predefined by the system.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * The priority of the action within the forwarding rule. Valid values: **1 to 50000**. A lower value indicates a higher priority. The actions of a forwarding rule are applied in descending order of priority. This parameter is required. The priority of each action within a forwarding rule must be unique. You can specify priorities for at most 20 actions.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public ServerGroupStickySession build() {
                return new ServerGroupStickySession(this);
            } 

        } 

    }
    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("Weight")
        private Integer weight;

        private ServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
            this.weight = builder.weight;
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

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String serverGroupId; 
            private Integer weight; 

            /**
             * The name of the header to insert. The name must be 1 to 40 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The header names specified by **InsertHeaderConfig** must be unique.
             * <p>
             * 
             * >  You cannot set the name of the header to any of the following values (case-insensitive): `slb-id`, `slb-ip`, `x-forwarded-for`, `x-forwarded-proto`, `x-forwarded-eip`, `x-forwarded-port`, `x-forwarded-client-srcport`, `connection`, `upgrade`, `content-length`, `transfer-encoding`, `keep-alive`, `te`, `host`, `cookie`, `remoteip`, and `authority`.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The value of the header to insert.
             * <p>
             * 
             * *   If **ValueType** is set to **SystemDefined**, you can set one of the following header values:
             * 
             *     *   **ClientSrcPort**: the client port.
             *     *   **ClientSrcIp**: the client IP address.
             *     *   **Protocol**: the request protocol (HTTP or HTTPS).
             *     *   **SLBId**: the ID of the ALB instance.
             *     *   **SLBPort**: the listening port.
             * 
             * *   If **ValueType** is set to **UserDefined**, you can specify a custom header value. The header value must be 1 to 128 characters in length and can contain printable characters whose ASCII character values are `greater than or equal to 32 and lower than 127`. You can use asterisks (\*) and question marks (?) as wildcards. The value cannot start or end with a space character.
             * 
             * *   If **ValueType** is set to **ReferenceHeader**, you can reference one of the request headers. The header value must be 1 to 128 characters in length, and can contain lowercase letters, digits, underscores (\_), and hyphens (-).
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupStickySession")
        private ServerGroupStickySession serverGroupStickySession;

        @NameInMap("ServerGroupTuples")
        private java.util.List < ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupStickySession = builder.serverGroupStickySession;
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupStickySession
         */
        public ServerGroupStickySession getServerGroupStickySession() {
            return this.serverGroupStickySession;
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private ServerGroupStickySession serverGroupStickySession; 
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * ServerGroupStickySession.
             */
            public Builder serverGroupStickySession(ServerGroupStickySession serverGroupStickySession) {
                this.serverGroupStickySession = serverGroupStickySession;
                return this;
            }

            /**
             * ServerGroupTuples.
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
    public static class InsertHeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueType")
        private String valueType;

        private InsertHeaderConfig(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsertHeaderConfig create() {
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

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private String key; 
            private String value; 
            private String valueType; 

            /**
             * The hostname to which requests are distributed. Valid values:
             * <p>
             * 
             * *   **${host}** (default): If you set the value to ${host}, you cannot append other characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcard characters.
             *     *   The hostname must contain at least one period (.) but cannot start or end with a period (.).
             *     *   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).
             *     *   The domain labels cannot start or end with a hyphen (-).
             *     *   You can use asterisks (\*) and question marks (?) as wildcards anywhere in a domain label.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The HTTP status code that indicates the redirect type. Valid values: **301**, **302**, **303**, **307**, and **308**.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The path to which requests are redirected. Valid values:
             * <p>
             * 
             * *   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The value is 1 to 128 characters in length.
             *     *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.
             *     *   The value is case-sensitive.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            public InsertHeaderConfig build() {
                return new InsertHeaderConfig(this);
            } 

        } 

    }
    public static class RedirectConfig extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("HttpCode")
        private String httpCode;

        @NameInMap("Path")
        private String path;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Query")
        private String query;

        private RedirectConfig(Builder builder) {
            this.host = builder.host;
            this.httpCode = builder.httpCode;
            this.path = builder.path;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectConfig create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return httpCode
         */
        public String getHttpCode() {
            return this.httpCode;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String host; 
            private String httpCode; 
            private String path; 
            private String port; 
            private String protocol; 
            private String query; 

            /**
             * The redirect protocol. Valid values:
             * <p>
             * 
             * *   **${protocol}** (default): If you set the value to ${protocol}, you cannot append other characters.
             * *   You can set the protocol to **HTTP** or **HTTPS**.
             * 
             * >  HTTPS listeners do not support HTTPS-to-HTTP redirects.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The query string of the URL to which requests are redirected.
             * <p>
             * 
             * *   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The value is 1 to 128 characters in length.
             *     *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.
             */
            public Builder httpCode(String httpCode) {
                this.httpCode = httpCode;
                return this;
            }

            /**
             * The hostname to which requests are redirected. Valid values:
             * <p>
             * 
             * *   **${host}** (default): If you set the value to ${host}, you cannot append other characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), and periods (.). You can use asterisks (\*) and question marks (?) as wildcard characters.
             *     *   The hostname must contain at least one period (.) but cannot start or end with a period (.).
             *     *   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).
             *     *   The domain labels cannot start or end with a hyphen (-). You can use an asterisk (\*) and question mark (?) as wildcards anywhere in a domain label.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The path to which requests are redirected. Valid values:
             * <p>
             * 
             * *   Default value: **${path}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The value is 1 to 128 characters in length.
             *     *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.
             *     *   The value is case-sensitive.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The query string of the URL to which requests are redirected.
             * <p>
             * 
             * *   Default value: **${query}**. **${host}**, **${protocol}**, and **${port}** are also supported. Each variable cannot be specified more than once. You can specify one or more of the preceding variables in each request. You can also combine them with the following characters.
             * 
             * *   If you want to specify a custom value, make sure that the following requirements are met:
             * 
             *     *   The value is 1 to 128 characters in length.
             *     *   It can contain printable characters, except space characters, the special characters `# [ ] { } \ | < > &`, and uppercase letters.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The action type. You can specify at most 11 types of action. Valid values:
             * <p>
             * 
             * *   **ForwardGroup**: forwards a request to multiple vServer groups.
             * *   **Redirect**: redirects a request.
             * *   **FixedResponse**: returns a custom response.
             * *   **Rewrite**: rewrites a request.
             * *   **InsertHeader**: inserts a header.
             * *   **RemoveHeaderConfig**: deletes a header.
             * *   **TrafficLimitConfig**: throttles network traffic.
             * *   **TrafficMirrorConfig**: mirrors network traffic.
             * *   **CORS**: enables cross-origin resource sharing (CORS).
             * 
             * You can specify the last action and the actions that you want to perform before the last action:
             * 
             * *   **FinalType**: the last action to be performed in a forwarding rule. Each forwarding rule can contain only one FinalType action. You can specify a **ForwardGroup**, **Redirect**, or **FixedResponse** action as the FinalType action.
             * *   **ExtType**: the action to be performed before the FinalType action. A forwarding rule can contain one or more ExtType actions. To specify this parameter, you must also specify FinalType. You can specify multiple **InsertHeader** actions or one **Rewrite** action.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public RedirectConfig build() {
                return new RedirectConfig(this);
            } 

        } 

    }
    public static class RewriteConfig extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Path")
        private String path;

        @NameInMap("Query")
        private String query;

        private RewriteConfig(Builder builder) {
            this.host = builder.host;
            this.path = builder.path;
            this.query = builder.query;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RewriteConfig create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        public static final class Builder {
            private String host; 
            private String path; 
            private String query; 

            /**
             * Queries per second (QPS). Valid values: **1 to 100000**.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The QPS of each IP address. Valid values: **1 to 100000**.
             * <p>
             * 
             * >  If **QPS** and PerIpQps are configured at the same time, the value of the **PerIpQps** parameter must be smaller than that of the **QPS** parameter.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The type of destination to which network traffic is mirrored. Valid values:
             * <p>
             * 
             * *   **ForwardGroupMirror**: a server group.
             * *   **SlsMirror**: Log Service.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            public RewriteConfig build() {
                return new RewriteConfig(this);
            } 

        } 

    }
    public static class TrafficLimitConfig extends TeaModel {
        @NameInMap("PerIpQps")
        private Integer perIpQps;

        @NameInMap("QPS")
        private Integer QPS;

        private TrafficLimitConfig(Builder builder) {
            this.perIpQps = builder.perIpQps;
            this.QPS = builder.QPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficLimitConfig create() {
            return builder().build();
        }

        /**
         * @return perIpQps
         */
        public Integer getPerIpQps() {
            return this.perIpQps;
        }

        /**
         * @return QPS
         */
        public Integer getQPS() {
            return this.QPS;
        }

        public static final class Builder {
            private Integer perIpQps; 
            private Integer QPS; 

            /**
             * The allowed HTTP methods for CORS requests. Valid values:
             * <p>
             * 
             * *   **GET**
             * *   **POST**
             * *   **PUT**
             * *   **DELETE**
             * *   **HEAD**
             * *   **OPTIONS**
             * *   **PATCH**
             */
            public Builder perIpQps(Integer perIpQps) {
                this.perIpQps = perIpQps;
                return this;
            }

            /**
             * The origin site that is allowed to access. You can specify an asterisk (`*`) or one or more values. The value cannot be an asterisk (`*`).
             * <p>
             * 
             * *   The value must start with `http://` or `https://` and include a valid domain name or top-level wildcard domain name, such as `*.test.abc.example.com`.
             * *   You can choose to include a port number from **1** to **65535** in each value based on your business requirement.
             */
            public Builder QPS(Integer QPS) {
                this.QPS = QPS;
                return this;
            }

            public TrafficLimitConfig build() {
                return new TrafficLimitConfig(this);
            } 

        } 

    }
    public static class MirrorGroupConfigServerGroupTuples extends TeaModel {
        @NameInMap("ServerGroupId")
        private String serverGroupId;

        private MirrorGroupConfigServerGroupTuples(Builder builder) {
            this.serverGroupId = builder.serverGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorGroupConfigServerGroupTuples create() {
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
             * The headers that are allowed to expose. You can specify an asterisk (`*`) or one or more values. Separate multiple values with commas (,). The value must be 1 to 32 characters in length, and can contain letters and digits. The value cannot start or end with an underscore (\_) or hyphen (-).
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            public MirrorGroupConfigServerGroupTuples build() {
                return new MirrorGroupConfigServerGroupTuples(this);
            } 

        } 

    }
    public static class MirrorGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        private java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples;

        private MirrorGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List < MirrorGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples; 

            /**
             * ServerGroupTuples.
             */
            public Builder serverGroupTuples(java.util.List < MirrorGroupConfigServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public MirrorGroupConfig build() {
                return new MirrorGroupConfig(this);
            } 

        } 

    }
    public static class TrafficMirrorConfig extends TeaModel {
        @NameInMap("MirrorGroupConfig")
        private MirrorGroupConfig mirrorGroupConfig;

        @NameInMap("TargetType")
        private String targetType;

        private TrafficMirrorConfig(Builder builder) {
            this.mirrorGroupConfig = builder.mirrorGroupConfig;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMirrorConfig create() {
            return builder().build();
        }

        /**
         * @return mirrorGroupConfig
         */
        public MirrorGroupConfig getMirrorGroupConfig() {
            return this.mirrorGroupConfig;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private MirrorGroupConfig mirrorGroupConfig; 
            private String targetType; 

            /**
             * MirrorGroupConfig.
             */
            public Builder mirrorGroupConfig(MirrorGroupConfig mirrorGroupConfig) {
                this.mirrorGroupConfig = mirrorGroupConfig;
                return this;
            }

            /**
             * The allowed headers for CORS requests. You can specify an asterisk (`*`) or one or more values. Separate multiple values with commas (,). The value must be 1 to 32 characters in length, and can contain letters and digits. The value cannot start or end with an underscore (\_) or hyphen (-).
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TrafficMirrorConfig build() {
                return new TrafficMirrorConfig(this);
            } 

        } 

    }
    public static class RuleActions extends TeaModel {
        @NameInMap("CorsConfig")
        private CorsConfig corsConfig;

        @NameInMap("FixedResponseConfig")
        private FixedResponseConfig fixedResponseConfig;

        @NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("InsertHeaderConfig")
        private InsertHeaderConfig insertHeaderConfig;

        @NameInMap("Order")
        @Validation(required = true)
        private Integer order;

        @NameInMap("RedirectConfig")
        private RedirectConfig redirectConfig;

        @NameInMap("RewriteConfig")
        private RewriteConfig rewriteConfig;

        @NameInMap("TrafficLimitConfig")
        private TrafficLimitConfig trafficLimitConfig;

        @NameInMap("TrafficMirrorConfig")
        private TrafficMirrorConfig trafficMirrorConfig;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private RuleActions(Builder builder) {
            this.corsConfig = builder.corsConfig;
            this.fixedResponseConfig = builder.fixedResponseConfig;
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.insertHeaderConfig = builder.insertHeaderConfig;
            this.order = builder.order;
            this.redirectConfig = builder.redirectConfig;
            this.rewriteConfig = builder.rewriteConfig;
            this.trafficLimitConfig = builder.trafficLimitConfig;
            this.trafficMirrorConfig = builder.trafficMirrorConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
        }

        /**
         * @return corsConfig
         */
        public CorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        /**
         * @return fixedResponseConfig
         */
        public FixedResponseConfig getFixedResponseConfig() {
            return this.fixedResponseConfig;
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return insertHeaderConfig
         */
        public InsertHeaderConfig getInsertHeaderConfig() {
            return this.insertHeaderConfig;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return redirectConfig
         */
        public RedirectConfig getRedirectConfig() {
            return this.redirectConfig;
        }

        /**
         * @return rewriteConfig
         */
        public RewriteConfig getRewriteConfig() {
            return this.rewriteConfig;
        }

        /**
         * @return trafficLimitConfig
         */
        public TrafficLimitConfig getTrafficLimitConfig() {
            return this.trafficLimitConfig;
        }

        /**
         * @return trafficMirrorConfig
         */
        public TrafficMirrorConfig getTrafficMirrorConfig() {
            return this.trafficMirrorConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CorsConfig corsConfig; 
            private FixedResponseConfig fixedResponseConfig; 
            private ForwardGroupConfig forwardGroupConfig; 
            private InsertHeaderConfig insertHeaderConfig; 
            private Integer order; 
            private RedirectConfig redirectConfig; 
            private RewriteConfig rewriteConfig; 
            private TrafficLimitConfig trafficLimitConfig; 
            private TrafficMirrorConfig trafficMirrorConfig; 
            private String type; 

            /**
             * CorsConfig.
             */
            public Builder corsConfig(CorsConfig corsConfig) {
                this.corsConfig = corsConfig;
                return this;
            }

            /**
             * FixedResponseConfig.
             */
            public Builder fixedResponseConfig(FixedResponseConfig fixedResponseConfig) {
                this.fixedResponseConfig = fixedResponseConfig;
                return this;
            }

            /**
             * ForwardGroupConfig.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * InsertHeaderConfig.
             */
            public Builder insertHeaderConfig(InsertHeaderConfig insertHeaderConfig) {
                this.insertHeaderConfig = insertHeaderConfig;
                return this;
            }

            /**
             * The port to which requests are redirected.
             * <p>
             * 
             * *   **${port}** (default): If you set the value to ${port}, you cannot append other characters.
             * *   You can also enter a port number. Valid values: **1 to 63335**.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * RedirectConfig.
             */
            public Builder redirectConfig(RedirectConfig redirectConfig) {
                this.redirectConfig = redirectConfig;
                return this;
            }

            /**
             * RewriteConfig.
             */
            public Builder rewriteConfig(RewriteConfig rewriteConfig) {
                this.rewriteConfig = rewriteConfig;
                return this;
            }

            /**
             * TrafficLimitConfig.
             */
            public Builder trafficLimitConfig(TrafficLimitConfig trafficLimitConfig) {
                this.trafficLimitConfig = trafficLimitConfig;
                return this;
            }

            /**
             * TrafficMirrorConfig.
             */
            public Builder trafficMirrorConfig(TrafficMirrorConfig trafficMirrorConfig) {
                this.trafficMirrorConfig = trafficMirrorConfig;
                return this;
            }

            /**
             * The ID of the vServer group.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleActions build() {
                return new RuleActions(this);
            } 

        } 

    }
    public static class Values extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Values(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
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
             * The hostname. A forwarding rule can contain only one unique hostname.
             * <p>
             * 
             * *   The hostname must be 3 to 128 characters in length, and can contain lowercase letters, digits, hyphens (-), periods (.), asterisks (\*), and question marks (?).
             * *   The hostname must contain at least one period (.) but cannot start or end with a period (.).
             * *   The rightmost domain label can contain only letters and wildcard characters. It cannot contain digits or hyphens (-).
             * *   The domain labels do not start or end with hyphens (-). You can use an asterisk (\*) and question mark (?) as wildcards anywhere in a domain label.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The request methods. Valid values: **HEAD**, **GET**, **POST**, **OPTIONS**, **PUT**, **PATCH**, and **DELETE**.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class CookieConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < Values> values;

        private CookieConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CookieConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < Values> values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public CookieConfig build() {
                return new CookieConfig(this);
            } 

        } 

    }
    public static class HeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

        private HeaderConfig(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The path to which requests are forwarded. Limits:
             * <p>
             * 
             * *   The path must be 1 to 128 characters in length.
             * *   It must start with a forward slash (/) and can contain letters, digits, and the following special characters: `$ - _ .+ / & ~ @ :`. It cannot contain the following special characters: `" % # ; ! ( ) [ ]^ , "`. You can use asterisks (\*) and question marks (?) as wildcards.
             * *   The value is case-sensitive.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public HeaderConfig build() {
                return new HeaderConfig(this);
            } 

        } 

    }
    public static class HostConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private HostConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public HostConfig build() {
                return new HostConfig(this);
            } 

        } 

    }
    public static class MethodConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private MethodConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MethodConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public MethodConfig build() {
                return new MethodConfig(this);
            } 

        } 

    }
    public static class PathConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private PathConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public PathConfig build() {
                return new PathConfig(this);
            } 

        } 

    }
    public static class QueryStringConfigValues extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private QueryStringConfigValues(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringConfigValues create() {
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
             * The type of forwarding rule. You can specify at most seven types. Valid values:
             * <p>
             * 
             * *   **Host**: Requests are forwarded based on hosts.
             * *   **Path**: Requests are forwarded based on paths.
             * *   **Header**: Requests are forwarded based on HTTP headers.
             * *   **QueryString**: Requests are forwarded based on query strings.
             * *   **Method**: Requests are forwarded based on request methods.
             * *   **Cookie**: Requests are forwarded based on cookies.
             * *   **SourceIp**: Requests are forwarded based on source IP addresses.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IP addresses or CIDR blocks.
             * <p>
             * 
             * You can specify at most five values for **SourceIp**.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryStringConfigValues build() {
                return new QueryStringConfigValues(this);
            } 

        } 

    }
    public static class QueryStringConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < QueryStringConfigValues> values;

        private QueryStringConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < QueryStringConfigValues> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < QueryStringConfigValues> values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < QueryStringConfigValues> values) {
                this.values = values;
                return this;
            }

            public QueryStringConfig build() {
                return new QueryStringConfig(this);
            } 

        } 

    }
    public static class ResponseHeaderConfig extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

        private ResponseHeaderConfig(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseHeaderConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The name of the forwarding rule. You can name at most 20 forwarding rules.
             * <p>
             * 
             * *   The name must be 2 to 128 characters in length.
             * *   It can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public ResponseHeaderConfig build() {
                return new ResponseHeaderConfig(this);
            } 

        } 

    }
    public static class SourceIpConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private SourceIpConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceIpConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public SourceIpConfig build() {
                return new SourceIpConfig(this);
            } 

        } 

    }
    public static class RuleConditions extends TeaModel {
        @NameInMap("CookieConfig")
        private CookieConfig cookieConfig;

        @NameInMap("HeaderConfig")
        private HeaderConfig headerConfig;

        @NameInMap("HostConfig")
        private HostConfig hostConfig;

        @NameInMap("MethodConfig")
        private MethodConfig methodConfig;

        @NameInMap("PathConfig")
        private PathConfig pathConfig;

        @NameInMap("QueryStringConfig")
        private QueryStringConfig queryStringConfig;

        @NameInMap("ResponseHeaderConfig")
        private ResponseHeaderConfig responseHeaderConfig;

        @NameInMap("SourceIpConfig")
        private SourceIpConfig sourceIpConfig;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private RuleConditions(Builder builder) {
            this.cookieConfig = builder.cookieConfig;
            this.headerConfig = builder.headerConfig;
            this.hostConfig = builder.hostConfig;
            this.methodConfig = builder.methodConfig;
            this.pathConfig = builder.pathConfig;
            this.queryStringConfig = builder.queryStringConfig;
            this.responseHeaderConfig = builder.responseHeaderConfig;
            this.sourceIpConfig = builder.sourceIpConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditions create() {
            return builder().build();
        }

        /**
         * @return cookieConfig
         */
        public CookieConfig getCookieConfig() {
            return this.cookieConfig;
        }

        /**
         * @return headerConfig
         */
        public HeaderConfig getHeaderConfig() {
            return this.headerConfig;
        }

        /**
         * @return hostConfig
         */
        public HostConfig getHostConfig() {
            return this.hostConfig;
        }

        /**
         * @return methodConfig
         */
        public MethodConfig getMethodConfig() {
            return this.methodConfig;
        }

        /**
         * @return pathConfig
         */
        public PathConfig getPathConfig() {
            return this.pathConfig;
        }

        /**
         * @return queryStringConfig
         */
        public QueryStringConfig getQueryStringConfig() {
            return this.queryStringConfig;
        }

        /**
         * @return responseHeaderConfig
         */
        public ResponseHeaderConfig getResponseHeaderConfig() {
            return this.responseHeaderConfig;
        }

        /**
         * @return sourceIpConfig
         */
        public SourceIpConfig getSourceIpConfig() {
            return this.sourceIpConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CookieConfig cookieConfig; 
            private HeaderConfig headerConfig; 
            private HostConfig hostConfig; 
            private MethodConfig methodConfig; 
            private PathConfig pathConfig; 
            private QueryStringConfig queryStringConfig; 
            private ResponseHeaderConfig responseHeaderConfig; 
            private SourceIpConfig sourceIpConfig; 
            private String type; 

            /**
             * CookieConfig.
             */
            public Builder cookieConfig(CookieConfig cookieConfig) {
                this.cookieConfig = cookieConfig;
                return this;
            }

            /**
             * HeaderConfig.
             */
            public Builder headerConfig(HeaderConfig headerConfig) {
                this.headerConfig = headerConfig;
                return this;
            }

            /**
             * HostConfig.
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * MethodConfig.
             */
            public Builder methodConfig(MethodConfig methodConfig) {
                this.methodConfig = methodConfig;
                return this;
            }

            /**
             * PathConfig.
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * QueryStringConfig.
             */
            public Builder queryStringConfig(QueryStringConfig queryStringConfig) {
                this.queryStringConfig = queryStringConfig;
                return this;
            }

            /**
             * ResponseHeaderConfig.
             */
            public Builder responseHeaderConfig(ResponseHeaderConfig responseHeaderConfig) {
                this.responseHeaderConfig = responseHeaderConfig;
                return this;
            }

            /**
             * SourceIpConfig.
             */
            public Builder sourceIpConfig(SourceIpConfig sourceIpConfig) {
                this.sourceIpConfig = sourceIpConfig;
                return this;
            }

            /**
             * The ID of the asynchronous task.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The name of the forwarding rule. You can name at most 20 forwarding rules.
             * <p>
             * 
             * *   The name must be 2 to 128 characters in length.
             * *   It can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The IP addresses or CIDR blocks.
             * <p>
             * 
             * You can specify at most five values for **SourceIp**.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Direction")
        private String direction;

        @NameInMap("Priority")
        @Validation(required = true)
        private Integer priority;

        @NameInMap("RuleActions")
        @Validation(required = true)
        private java.util.List < RuleActions> ruleActions;

        @NameInMap("RuleConditions")
        @Validation(required = true)
        private java.util.List < RuleConditions> ruleConditions;

        @NameInMap("RuleName")
        @Validation(required = true)
        private String ruleName;

        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Rules(Builder builder) {
            this.direction = builder.direction;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.ruleName = builder.ruleName;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return ruleActions
         */
        public java.util.List < RuleActions> getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleConditions
         */
        public java.util.List < RuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String direction; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 
            private String ruleName; 
            private java.util.List < Tag> tag; 

            /**
             * The ID of the forwarding rule.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * The server group to which requests are distributed.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RuleActions.
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * RuleConditions.
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * The list of forwarding rules.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
