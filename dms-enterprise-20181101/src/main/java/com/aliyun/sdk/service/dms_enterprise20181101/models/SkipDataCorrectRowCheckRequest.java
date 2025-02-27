// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SkipDataCorrectRowCheckRequest} extends {@link RequestModel}
 *
 * <p>SkipDataCorrectRowCheckRequest</p>
 */
public class SkipDataCorrectRowCheckRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("Reason")
    @Validation(required = true)
    private String reason;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private SkipDataCorrectRowCheckRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderId = builder.orderId;
        this.reason = builder.reason;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkipDataCorrectRowCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SkipDataCorrectRowCheckRequest, Builder> {
        private String regionId; 
        private Long orderId; 
        private String reason; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SkipDataCorrectRowCheckRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderId = request.orderId;
            this.reason = request.reason;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public SkipDataCorrectRowCheckRequest build() {
            return new SkipDataCorrectRowCheckRequest(this);
        } 

    } 

}
