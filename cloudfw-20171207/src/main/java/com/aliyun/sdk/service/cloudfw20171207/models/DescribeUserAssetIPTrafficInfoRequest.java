// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAssetIPTrafficInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserAssetIPTrafficInfoRequest</p>
 */
public class DescribeUserAssetIPTrafficInfoRequest extends Request {
    @Query
    @NameInMap("AssetIP")
    @Validation(required = true)
    private String assetIP;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TrafficTime")
    @Validation(required = true)
    private String trafficTime;

    private DescribeUserAssetIPTrafficInfoRequest(Builder builder) {
        super(builder);
        this.assetIP = builder.assetIP;
        this.lang = builder.lang;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAssetIPTrafficInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetIP
     */
    public String getAssetIP() {
        return this.assetIP;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return trafficTime
     */
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder extends Request.Builder<DescribeUserAssetIPTrafficInfoRequest, Builder> {
        private String assetIP; 
        private String lang; 
        private String trafficTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserAssetIPTrafficInfoRequest request) {
            super(request);
            this.assetIP = request.assetIP;
            this.lang = request.lang;
            this.trafficTime = request.trafficTime;
        } 

        /**
         * The IP address of the asset.
         */
        public Builder assetIP(String assetIP) {
            this.putQueryParameter("AssetIP", assetIP);
            this.assetIP = assetIP;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The point in time to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder trafficTime(String trafficTime) {
            this.putQueryParameter("TrafficTime", trafficTime);
            this.trafficTime = trafficTime;
            return this;
        }

        @Override
        public DescribeUserAssetIPTrafficInfoRequest build() {
            return new DescribeUserAssetIPTrafficInfoRequest(this);
        } 

    } 

}
