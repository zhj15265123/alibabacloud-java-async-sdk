// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceDescriptionRequest</p>
 */
public class ModifyDBInstanceDescriptionRequest extends Request {
    @Query
    @NameInMap("DBInstanceDescription")
    @Validation(required = true)
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyDBInstanceDescriptionRequest(Builder builder) {
        super(builder);
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceDescriptionRequest, Builder> {
        private String DBInstanceDescription; 
        private String DBInstanceId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceDescriptionRequest request) {
            super(request);
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceId = request.DBInstanceId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The description of the instance.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It cannot start with http:// or https://.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * >  You can call the [DescribeDBInstances](~~86911~~) operation to query the instance IDs of all AnalyticDB for PostgreSQL instances in a specific region.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs. For more information about how to obtain the ID of a resource group, see [View basic information of a resource group](~~151181~~).
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyDBInstanceDescriptionRequest build() {
            return new ModifyDBInstanceDescriptionRequest(this);
        } 

    } 

}
