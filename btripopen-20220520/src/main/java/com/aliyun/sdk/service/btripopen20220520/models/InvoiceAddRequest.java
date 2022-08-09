// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceAddRequest} extends {@link RequestModel}
 *
 * <p>InvoiceAddRequest</p>
 */
public class InvoiceAddRequest extends Request {
    @Body
    @NameInMap("address")
    private String address;

    @Body
    @NameInMap("bank_name")
    private String bankName;

    @Body
    @NameInMap("bank_no")
    private String bankNo;

    @Body
    @NameInMap("tax_no")
    @Validation(required = true)
    private String taxNo;

    @Body
    @NameInMap("tel")
    private String tel;

    @Body
    @NameInMap("third_part_id")
    @Validation(required = true)
    private String thirdPartId;

    @Body
    @NameInMap("title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private Integer type;

    private InvoiceAddRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.bankName = builder.bankName;
        this.bankNo = builder.bankNo;
        this.taxNo = builder.taxNo;
        this.tel = builder.tel;
        this.thirdPartId = builder.thirdPartId;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvoiceAddRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return bankName
     */
    public String getBankName() {
        return this.bankName;
    }

    /**
     * @return bankNo
     */
    public String getBankNo() {
        return this.bankNo;
    }

    /**
     * @return taxNo
     */
    public String getTaxNo() {
        return this.taxNo;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return this.tel;
    }

    /**
     * @return thirdPartId
     */
    public String getThirdPartId() {
        return this.thirdPartId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<InvoiceAddRequest, Builder> {
        private String address; 
        private String bankName; 
        private String bankNo; 
        private String taxNo; 
        private String tel; 
        private String thirdPartId; 
        private String title; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(InvoiceAddRequest request) {
            super(request);
            this.address = request.address;
            this.bankName = request.bankName;
            this.bankNo = request.bankNo;
            this.taxNo = request.taxNo;
            this.tel = request.tel;
            this.thirdPartId = request.thirdPartId;
            this.title = request.title;
            this.type = request.type;
        } 

        /**
         * 注册地址
         */
        public Builder address(String address) {
            this.putBodyParameter("address", address);
            this.address = address;
            return this;
        }

        /**
         * 开户行
         */
        public Builder bankName(String bankName) {
            this.putBodyParameter("bank_name", bankName);
            this.bankName = bankName;
            return this;
        }

        /**
         * 银行账号
         */
        public Builder bankNo(String bankNo) {
            this.putBodyParameter("bank_no", bankNo);
            this.bankNo = bankNo;
            return this;
        }

        /**
         * 税号
         */
        public Builder taxNo(String taxNo) {
            this.putBodyParameter("tax_no", taxNo);
            this.taxNo = taxNo;
            return this;
        }

        /**
         * 公司电话
         */
        public Builder tel(String tel) {
            this.putBodyParameter("tel", tel);
            this.tel = tel;
            return this;
        }

        /**
         * 第三方id
         */
        public Builder thirdPartId(String thirdPartId) {
            this.putBodyParameter("third_part_id", thirdPartId);
            this.thirdPartId = thirdPartId;
            return this;
        }

        /**
         * 发票抬头
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * 类型，1:增值税普通发票,2:增值税专用发票
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public InvoiceAddRequest build() {
            return new InvoiceAddRequest(this);
        } 

    } 

}
