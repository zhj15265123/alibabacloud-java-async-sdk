// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHostRequest} extends {@link RequestModel}
 *
 * <p>GetHostRequest</p>
 */
public class GetHostRequest extends Request {
    @Query
    @NameInMap("HostId")
    @Validation(required = true)
    private String hostId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetHostRequest(Builder builder) {
        super(builder);
        this.hostId = builder.hostId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHostRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetHostRequest, Builder> {
        private String hostId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetHostRequest request) {
            super(request);
            this.hostId = request.hostId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The protocol that is used to connect to the host. Valid values:
         * <p>
         * 
         * *   **SSH**
         * *   **RDP**
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
            return this;
        }

        /**
         * The ID of the host that you want to query. You can specify only one host ID.
         * <p>
         * 
         * >  You can call the [ListHosts](~~200665~~) operation to query the ID of the host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the host.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetHostRequest build() {
            return new GetHostRequest(this);
        } 

    } 

}
