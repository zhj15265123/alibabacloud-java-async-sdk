// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelIndexInfoRequest} extends {@link RequestModel}
 *
 * <p>HotelIndexInfoRequest</p>
 */
public class HotelIndexInfoRequest extends Request {
    @Query
    @NameInMap("city_code")
    @Validation(required = true)
    private String cityCode;

    @Query
    @NameInMap("hotel_status")
    private Integer hotelStatus;

    @Query
    @NameInMap("page_size")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("page_token")
    private String pageToken;

    @Header
    @NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private HotelIndexInfoRequest(Builder builder) {
        super(builder);
        this.cityCode = builder.cityCode;
        this.hotelStatus = builder.hotelStatus;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelIndexInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return hotelStatus
     */
    public Integer getHotelStatus() {
        return this.hotelStatus;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<HotelIndexInfoRequest, Builder> {
        private String cityCode; 
        private Integer hotelStatus; 
        private Integer pageSize; 
        private String pageToken; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(HotelIndexInfoRequest request) {
            super(request);
            this.cityCode = request.cityCode;
            this.hotelStatus = request.hotelStatus;
            this.pageSize = request.pageSize;
            this.pageToken = request.pageToken;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * city_code.
         */
        public Builder cityCode(String cityCode) {
            this.putQueryParameter("city_code", cityCode);
            this.cityCode = cityCode;
            return this;
        }

        /**
         * hotel_status.
         */
        public Builder hotelStatus(Integer hotelStatus) {
            this.putQueryParameter("hotel_status", hotelStatus);
            this.hotelStatus = hotelStatus;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * page_token.
         */
        public Builder pageToken(String pageToken) {
            this.putQueryParameter("page_token", pageToken);
            this.pageToken = pageToken;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public HotelIndexInfoRequest build() {
            return new HotelIndexInfoRequest(this);
        } 

    } 

}
