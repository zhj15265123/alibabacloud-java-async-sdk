// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSplitItemBillRequest} extends {@link RequestModel}
 *
 * <p>DescribeSplitItemBillRequest</p>
 */
public class DescribeSplitItemBillRequest extends Request {
    @Query
    @NameInMap("BillOwnerId")
    @Validation()
    private Long billOwnerId;

    @Query
    @NameInMap("BillingCycle")
    @Validation(required = true)
    private String billingCycle;

    @Query
    @NameInMap("BillingDate")
    private String billingDate;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("InstanceID")
    private String instanceID;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("SplitItemID")
    private String splitItemID;

    @Query
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    @Query
    @NameInMap("TagFilter")
    private java.util.List < TagFilter> tagFilter;

    private DescribeSplitItemBillRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.billingCycle = builder.billingCycle;
        this.billingDate = builder.billingDate;
        this.granularity = builder.granularity;
        this.instanceID = builder.instanceID;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.splitItemID = builder.splitItemID;
        this.subscriptionType = builder.subscriptionType;
        this.tagFilter = builder.tagFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSplitItemBillRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwnerId
     */
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return billingDate
     */
    public String getBillingDate() {
        return this.billingDate;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return instanceID
     */
    public String getInstanceID() {
        return this.instanceID;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return splitItemID
     */
    public String getSplitItemID() {
        return this.splitItemID;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return tagFilter
     */
    public java.util.List < TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static final class Builder extends Request.Builder<DescribeSplitItemBillRequest, Builder> {
        private Long billOwnerId; 
        private String billingCycle; 
        private String billingDate; 
        private String granularity; 
        private String instanceID; 
        private Integer maxResults; 
        private String nextToken; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private String splitItemID; 
        private String subscriptionType; 
        private java.util.List < TagFilter> tagFilter; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSplitItemBillRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.billingCycle = request.billingCycle;
            this.billingDate = request.billingDate;
            this.granularity = request.granularity;
            this.instanceID = request.instanceID;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.splitItemID = request.splitItemID;
            this.subscriptionType = request.subscriptionType;
            this.tagFilter = request.tagFilter;
        } 

        /**
         * The ID of the member. If you specify this parameter, the bills of the member are queried. If you do not specify this parameter, the bills of the current account are queried by default.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * The billing cycle. Specify the parameter in the YYYY-MM format.
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * The billing date. This parameter is required only when the Granularity parameter is set to DAILY. Format: YYYY-MM-DD.
         */
        public Builder billingDate(String billingDate) {
            this.putQueryParameter("BillingDate", billingDate);
            this.billingDate = billingDate;
            return this;
        }

        /**
         * The granularity at which bills are queried. Valid values:
         * <p>
         * 
         * *   MONTHLY: queries bills on a monthly basis. The data that you query is the same as the data that is queried by billing cycles in the Split Bill module of the User Center console.
         * *   DAILY: queries bills on a daily basis. The data that you query is the same as the data that is queried by days in the Split Bill module of the User Center console.
         * 
         * If you specify DAILY for this parameter, the BillingDate parameter is required.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceID(String instanceID) {
            this.putQueryParameter("InstanceID", instanceID);
            this.instanceID = instanceID;
            return this;
        }

        /**
         * The maximum number of entries to query. Default value: 20. Maximum value: 300.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. The parameter must be left empty or set to the value of the NextToken parameter returned in the last call. Otherwise, an error is returned. If the parameter is left empty, the data is queried from the first entry.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * The code of the service.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the service.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * The ID of the split item.
         */
        public Builder splitItemID(String splitItemID) {
            this.putQueryParameter("SplitItemID", splitItemID);
            this.splitItemID = splitItemID;
            return this;
        }

        /**
         * The billing method. Valid values: Subscription: the subscription billing method. PayAsYouGo: the pay-as-you-go billing method. This parameter must be used with the ProductCode parameter.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * The tags that are used to filter split bills. You can specify multiple tag values. If you specify multiple tag values, split bills that match one of the tag values are queried.
         */
        public Builder tagFilter(java.util.List < TagFilter> tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        @Override
        public DescribeSplitItemBillRequest build() {
            return new DescribeSplitItemBillRequest(this);
        } 

    } 

    public static class TagFilter extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValues")
        private java.util.List < String > tagValues;

        private TagFilter(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List < String > getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String tagKey; 
            private java.util.List < String > tagValues; 

            /**
             * The TagFilter.N parameter is used to query bills that match a specified tag. The value of the TagFilter.N parameter must be a key-value pair. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.
             * <p>
             * 
             * *   If only the TagFilter.N.TagKey parameter is specified, all bills associated with the tag key are queried.
             * *   If you specify multiple tag key-value pairs at the same time, bills that meet any one of the tag key-value pairs are queried.
             * *   If the tags added to resources change, you can query only the bills that are generated within the period in which the tags and resources are associated.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * You can specify the TagValues.N parameter to query bills that match the specified tag value. The value of the TagValues.N parameter must be a string. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.
             * <p>
             * 
             * *   If you specify the TagValues.N parameter, the TagFilter.N.TagKey parameter is required. Otherwise, the error message InvalidParameter.TagValues is returned.
             * *   If you specify multiple tag values, split bills that match one of the tag values are queried.
             */
            public Builder tagValues(java.util.List < String > tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
