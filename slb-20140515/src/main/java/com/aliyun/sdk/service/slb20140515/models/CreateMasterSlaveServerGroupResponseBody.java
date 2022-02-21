// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMasterSlaveServerGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMasterSlaveServerGroupResponseBody</p>
 */
public class CreateMasterSlaveServerGroupResponseBody extends TeaModel {
    @NameInMap("MasterSlaveBackendServers")
    private MasterSlaveBackendServers masterSlaveBackendServers;

    @NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateMasterSlaveServerGroupResponseBody(Builder builder) {
        this.masterSlaveBackendServers = builder.masterSlaveBackendServers;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMasterSlaveServerGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return masterSlaveBackendServers
     */
    public MasterSlaveBackendServers getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    /**
     * @return masterSlaveServerGroupId
     */
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MasterSlaveBackendServers masterSlaveBackendServers; 
        private String masterSlaveServerGroupId; 
        private String requestId; 

        /**
         * MasterSlaveBackendServers.
         */
        public Builder masterSlaveBackendServers(MasterSlaveBackendServers masterSlaveBackendServers) {
            this.masterSlaveBackendServers = masterSlaveBackendServers;
            return this;
        }

        /**
         * MasterSlaveServerGroupId.
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMasterSlaveServerGroupResponseBody build() {
            return new CreateMasterSlaveServerGroupResponseBody(this);
        } 

    } 

    public static class MasterSlaveBackendServer extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerType")
        private String serverType;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private MasterSlaveBackendServer(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.serverId = builder.serverId;
            this.serverType = builder.serverType;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveBackendServer create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String description; 
            private Integer port; 
            private String serverId; 
            private String serverType; 
            private String type; 
            private Integer weight; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * ServerType.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public MasterSlaveBackendServer build() {
                return new MasterSlaveBackendServer(this);
            } 

        } 

    }
    public static class MasterSlaveBackendServers extends TeaModel {
        @NameInMap("MasterSlaveBackendServer")
        private java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer;

        private MasterSlaveBackendServers(Builder builder) {
            this.masterSlaveBackendServer = builder.masterSlaveBackendServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MasterSlaveBackendServers create() {
            return builder().build();
        }

        /**
         * @return masterSlaveBackendServer
         */
        public java.util.List < MasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

        public static final class Builder {
            private java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer; 

            /**
             * MasterSlaveBackendServer.
             */
            public Builder masterSlaveBackendServer(java.util.List < MasterSlaveBackendServer> masterSlaveBackendServer) {
                this.masterSlaveBackendServer = masterSlaveBackendServer;
                return this;
            }

            public MasterSlaveBackendServers build() {
                return new MasterSlaveBackendServers(this);
            } 

        } 

    }
}
