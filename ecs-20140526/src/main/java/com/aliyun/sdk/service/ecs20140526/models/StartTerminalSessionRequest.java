// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTerminalSessionRequest} extends {@link RequestModel}
 *
 * <p>StartTerminalSessionRequest</p>
 */
public class StartTerminalSessionRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("CommandLine")
    private String commandLine;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PortNumber")
    private Integer portNumber;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TargetServer")
    private String targetServer;

    private StartTerminalSessionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.commandLine = builder.commandLine;
        this.instanceId = builder.instanceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portNumber = builder.portNumber;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetServer = builder.targetServer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTerminalSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return commandLine
     */
    public String getCommandLine() {
        return this.commandLine;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return portNumber
     */
    public Integer getPortNumber() {
        return this.portNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return targetServer
     */
    public String getTargetServer() {
        return this.targetServer;
    }

    public static final class Builder extends Request.Builder<StartTerminalSessionRequest, Builder> {
        private String sourceRegionId; 
        private String commandLine; 
        private java.util.List < String > instanceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer portNumber; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetServer; 

        private Builder() {
            super();
        } 

        private Builder(StartTerminalSessionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.commandLine = request.commandLine;
            this.instanceId = request.instanceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portNumber = request.portNumber;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetServer = request.targetServer;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * If you set this parameter to the IP address of an instance, the PortNumber parameter specifies the port number of the instance.
         * <p>
         * 
         * >If you specify `CommandLine`, you do not need to specify `PortNumber` or `TargetServer`.
         */
        public Builder commandLine(String commandLine) {
            this.putQueryParameter("CommandLine", commandLine);
            this.commandLine = commandLine;
            return this;
        }

        /**
         * The instance IDs.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The port number of the instance. The port is used to forward data. After this parameter is configured, Cloud Assistant Agent forwards data to the specified port for forwarding. Example: 22.
         * <p>
         * 
         * This parameter is empty by default, which indicates that no port is configured to forward data.
         */
        public Builder portNumber(Integer portNumber) {
            this.putQueryParameter("PortNumber", portNumber);
            this.portNumber = portNumber;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The IP address of the instance.
         * <p>
         * 
         * >If you set this parameter to the IP address of an instance, the `PortNumber` parameter specifies the port number of the instance.
         */
        public Builder targetServer(String targetServer) {
            this.putQueryParameter("TargetServer", targetServer);
            this.targetServer = targetServer;
            return this;
        }

        @Override
        public StartTerminalSessionRequest build() {
            return new StartTerminalSessionRequest(this);
        } 

    } 

}
