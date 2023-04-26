// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainConfigsResponseBody</p>
 */
public class DescribeVodDomainConfigsResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    private DomainConfigs domainConfigs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainConfigsResponseBody(Builder builder) {
        this.domainConfigs = builder.domainConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigs
     */
    public DomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainConfigs domainConfigs; 
        private String requestId; 

        /**
         * The value of the parameter.
         */
        public Builder domainConfigs(DomainConfigs domainConfigs) {
            this.domainConfigs = domainConfigs;
            return this;
        }

        /**
         * The status of the configuration. Valid values:
         * <p>
         * 
         * - **success**
         * - **testing**
         * - **failed**
         * - **configuring**
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainConfigsResponseBody build() {
            return new DescribeVodDomainConfigsResponseBody(this);
        } 

    } 

    public static class FunctionArg extends TeaModel {
        @NameInMap("ArgName")
        private String argName;

        @NameInMap("ArgValue")
        private String argValue;

        private FunctionArg(Builder builder) {
            this.argName = builder.argName;
            this.argValue = builder.argValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionArg create() {
            return builder().build();
        }

        /**
         * @return argName
         */
        public String getArgName() {
            return this.argName;
        }

        /**
         * @return argValue
         */
        public String getArgValue() {
            return this.argValue;
        }

        public static final class Builder {
            private String argName; 
            private String argValue; 

            /**
             * ArgName.
             */
            public Builder argName(String argName) {
                this.argName = argName;
                return this;
            }

            /**
             * ArgValue.
             */
            public Builder argValue(String argValue) {
                this.argValue = argValue;
                return this;
            }

            public FunctionArg build() {
                return new FunctionArg(this);
            } 

        } 

    }
    public static class FunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        private java.util.List < FunctionArg> functionArg;

        private FunctionArgs(Builder builder) {
            this.functionArg = builder.functionArg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionArgs create() {
            return builder().build();
        }

        /**
         * @return functionArg
         */
        public java.util.List < FunctionArg> getFunctionArg() {
            return this.functionArg;
        }

        public static final class Builder {
            private java.util.List < FunctionArg> functionArg; 

            /**
             * FunctionArg.
             */
            public Builder functionArg(java.util.List < FunctionArg> functionArg) {
                this.functionArg = functionArg;
                return this;
            }

            public FunctionArgs build() {
                return new FunctionArgs(this);
            } 

        } 

    }
    public static class DomainConfig extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("FunctionArgs")
        private FunctionArgs functionArgs;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Status")
        private String status;

        private DomainConfig(Builder builder) {
            this.configId = builder.configId;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfig create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return functionArgs
         */
        public FunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String configId; 
            private FunctionArgs functionArgs; 
            private String functionName; 
            private String status; 

            /**
             * ## Feature description
             * <p>
             * 
             * | Feature | Description |
             * | ------- | ----------- |
             * | referer_white_list_set | Specifies the referer whitelist. |
             * | referer_black_list_set | Specifies the referer blacklist. |
             * | filetype_based_ttl_set | Specifies the time period after which a file expires. |
             * | path_based_ttl_set | Specifies the time period after which a directory expires. |
             * | cc_defense | Configures protection against HTTP flood attacks. |
             * | oss_auth | Configures authentication for the access to an Object Storage Service (OSS) bucket. |
             * | ip_black_list_set | Specifies the IP address blacklist. |
             * | ip_white_list_set | Specifies the IP address whitelist. |
             * | error_page | Redirects an error page to a specified page. |
             * | tesla | Optimizes pages to accelerate access. |
             * | set_req_host_header | Modifies the custom header of back-to-origin requests. |
             * | set_hashkey_args | Ignores the specified URL parameters. |
             * | aliauth | Configures Alibaba Cloud authentication. |
             * | set_resp_header | Specifies a response header. To verify the setting, you can check the response message in a browser. |
             * | video_seek | Configures video seeking. |
             * | range | Configures object chunking. |
             * | gzip | Optimizes pages by using GNU zip (Gzip) compression. |
             * | https_force | Configures force redirect to HTTPS. |
             * | http_force | Configures force redirect to HTTP. |
             * | alivod | Configures ApsaraVideo VOD. |
             * | forward_scheme | Specifies the origin protocol policy or configures whether to enable adaptive origin fetch. |
             * | tmd_signature | Specifies the self-defined rules for the rate limit. |
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * FunctionArgs.
             */
            public Builder functionArgs(FunctionArgs functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * Queries the configurations of a specified domain name for CDN. You can query the configurations of one or more features at a time.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **DescribeVodDomainConfigs**.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DomainConfig build() {
                return new DomainConfig(this);
            } 

        } 

    }
    public static class DomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        private java.util.List < DomainConfig> domainConfig;

        private DomainConfigs(Builder builder) {
            this.domainConfig = builder.domainConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigs create() {
            return builder().build();
        }

        /**
         * @return domainConfig
         */
        public java.util.List < DomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

        public static final class Builder {
            private java.util.List < DomainConfig> domainConfig; 

            /**
             * DomainConfig.
             */
            public Builder domainConfig(java.util.List < DomainConfig> domainConfig) {
                this.domainConfig = domainConfig;
                return this;
            }

            public DomainConfigs build() {
                return new DomainConfigs(this);
            } 

        } 

    }
}
