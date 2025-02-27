// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQuickSaleConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeQuickSaleConfigRequest</p>
 */
public class DescribeQuickSaleConfigRequest extends Request {
    @Query
    @NameInMap("Commodity")
    private String commodity;

    @Query
    @NameInMap("Engine")
    private String engine;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribeQuickSaleConfigRequest(Builder builder) {
        super(builder);
        this.commodity = builder.commodity;
        this.engine = builder.engine;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQuickSaleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodity
     */
    public String getCommodity() {
        return this.commodity;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeQuickSaleConfigRequest, Builder> {
        private String commodity; 
        private String engine; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeQuickSaleConfigRequest request) {
            super(request);
            this.commodity = request.commodity;
            this.engine = request.engine;
            this.regionId = request.regionId;
        } 

        /**
         * Product code.
         */
        public Builder commodity(String commodity) {
            this.putQueryParameter("Commodity", commodity);
            this.commodity = commodity;
            return this;
        }

        /**
         * The database engine that is run by the instance. Valid values:
         * <p>
         * 
         * * **MySQL**
         * * **SQLServer**
         * * **PostgreSQL**
         * * **MariaDB**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeQuickSaleConfigRequest build() {
            return new DescribeQuickSaleConfigRequest(this);
        } 

    } 

}
