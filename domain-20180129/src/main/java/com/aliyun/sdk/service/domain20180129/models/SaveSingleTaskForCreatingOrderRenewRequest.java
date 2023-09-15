// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForCreatingOrderRenewRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingOrderRenewRequest</p>
 */
public class SaveSingleTaskForCreatingOrderRenewRequest extends Request {
    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("CurrentExpirationDate")
    @Validation(required = true)
    private Long currentExpirationDate;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PromotionNo")
    private String promotionNo;

    @Query
    @NameInMap("SubscriptionDuration")
    @Validation(required = true)
    private Integer subscriptionDuration;

    @Query
    @NameInMap("UseCoupon")
    private Boolean useCoupon;

    @Query
    @NameInMap("UsePromotion")
    private Boolean usePromotion;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForCreatingOrderRenewRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.currentExpirationDate = builder.currentExpirationDate;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.promotionNo = builder.promotionNo;
        this.subscriptionDuration = builder.subscriptionDuration;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForCreatingOrderRenewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return currentExpirationDate
     */
    public Long getCurrentExpirationDate() {
        return this.currentExpirationDate;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
    }

    /**
     * @return subscriptionDuration
     */
    public Integer getSubscriptionDuration() {
        return this.subscriptionDuration;
    }

    /**
     * @return useCoupon
     */
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    /**
     * @return usePromotion
     */
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveSingleTaskForCreatingOrderRenewRequest, Builder> {
        private String couponNo; 
        private Long currentExpirationDate; 
        private String domainName; 
        private String lang; 
        private String promotionNo; 
        private Integer subscriptionDuration; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForCreatingOrderRenewRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.currentExpirationDate = request.currentExpirationDate;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.promotionNo = request.promotionNo;
            this.subscriptionDuration = request.subscriptionDuration;
            this.useCoupon = request.useCoupon;
            this.usePromotion = request.usePromotion;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * CouponNo.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * CurrentExpirationDate.
         */
        public Builder currentExpirationDate(Long currentExpirationDate) {
            this.putQueryParameter("CurrentExpirationDate", currentExpirationDate);
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PromotionNo.
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * SubscriptionDuration.
         */
        public Builder subscriptionDuration(Integer subscriptionDuration) {
            this.putQueryParameter("SubscriptionDuration", subscriptionDuration);
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }

        /**
         * UseCoupon.
         */
        public Builder useCoupon(Boolean useCoupon) {
            this.putQueryParameter("UseCoupon", useCoupon);
            this.useCoupon = useCoupon;
            return this;
        }

        /**
         * UsePromotion.
         */
        public Builder usePromotion(Boolean usePromotion) {
            this.putQueryParameter("UsePromotion", usePromotion);
            this.usePromotion = usePromotion;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveSingleTaskForCreatingOrderRenewRequest build() {
            return new SaveSingleTaskForCreatingOrderRenewRequest(this);
        } 

    } 

}
