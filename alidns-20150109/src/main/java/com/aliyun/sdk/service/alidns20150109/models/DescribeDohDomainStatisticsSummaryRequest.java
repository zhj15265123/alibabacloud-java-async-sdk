// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohDomainStatisticsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeDohDomainStatisticsSummaryRequest</p>
 */
public class DescribeDohDomainStatisticsSummaryRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private DescribeDohDomainStatisticsSummaryRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohDomainStatisticsSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeDohDomainStatisticsSummaryRequest, Builder> {
        private String domainName; 
        private String endDate; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDohDomainStatisticsSummaryRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startDate = request.startDate;
        } 

        /**
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the YYYY-MM-DD format.
         * <p>
         * 
         * The default value is the day when you perform the operation.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * The language type.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.
         * <p>
         * 
         * You can query only the DNS records of the last 90 days. `The value of StartDate must be greater than or equal to the difference between the current date and 90`.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeDohDomainStatisticsSummaryRequest build() {
            return new DescribeDohDomainStatisticsSummaryRequest(this);
        } 

    } 

}
