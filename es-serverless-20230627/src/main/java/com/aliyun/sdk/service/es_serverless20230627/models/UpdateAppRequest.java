// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppRequest</p>
 */
public class UpdateAppRequest extends Request {
    @Path
    @NameInMap("appName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("authentication")
    private Authentication authentication;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("network")
    private java.util.List < Network> network;

    private UpdateAppRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.authentication = builder.authentication;
        this.description = builder.description;
        this.network = builder.network;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authentication
     */
    public Authentication getAuthentication() {
        return this.authentication;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return network
     */
    public java.util.List < Network> getNetwork() {
        return this.network;
    }

    public static final class Builder extends Request.Builder<UpdateAppRequest, Builder> {
        private String appName; 
        private Authentication authentication; 
        private String description; 
        private java.util.List < Network> network; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppRequest request) {
            super(request);
            this.appName = request.appName;
            this.authentication = request.authentication;
            this.description = request.description;
            this.network = request.network;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * authentication.
         */
        public Builder authentication(Authentication authentication) {
            this.putBodyParameter("authentication", authentication);
            this.authentication = authentication;
            return this;
        }

        /**
         * 应用备注
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * network.
         */
        public Builder network(java.util.List < Network> network) {
            this.putBodyParameter("network", network);
            this.network = network;
            return this;
        }

        @Override
        public UpdateAppRequest build() {
            return new UpdateAppRequest(this);
        } 

    } 

    public static class BasicAuth extends TeaModel {
        @NameInMap("password")
        private String password;

        @NameInMap("username")
        private String username;

        private BasicAuth(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicAuth create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String username; 

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public BasicAuth build() {
                return new BasicAuth(this);
            } 

        } 

    }
    public static class Authentication extends TeaModel {
        @NameInMap("basicAuth")
        private java.util.List < BasicAuth> basicAuth;

        private Authentication(Builder builder) {
            this.basicAuth = builder.basicAuth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authentication create() {
            return builder().build();
        }

        /**
         * @return basicAuth
         */
        public java.util.List < BasicAuth> getBasicAuth() {
            return this.basicAuth;
        }

        public static final class Builder {
            private java.util.List < BasicAuth> basicAuth; 

            /**
             * basicAuth.
             */
            public Builder basicAuth(java.util.List < BasicAuth> basicAuth) {
                this.basicAuth = basicAuth;
                return this;
            }

            public Authentication build() {
                return new Authentication(this);
            } 

        } 

    }
    public static class WhiteIpGroup extends TeaModel {
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
    public static class Network extends TeaModel {
        @NameInMap("domain")
        private String domain;

        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("port")
        private Integer port;

        @NameInMap("type")
        private String type;

        @NameInMap("whiteIpGroup")
        private java.util.List < WhiteIpGroup> whiteIpGroup;

        private Network(Builder builder) {
            this.domain = builder.domain;
            this.enabled = builder.enabled;
            this.port = builder.port;
            this.type = builder.type;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List < WhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enabled; 
            private Integer port; 
            private String type; 
            private java.util.List < WhiteIpGroup> whiteIpGroup; 

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List < WhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
}
