// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyModifyRequest} extends {@link RequestModel}
 *
 * <p>CarApplyModifyRequest</p>
 */
public class CarApplyModifyRequest extends Request {
    @Body
    @NameInMap("corp_id")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("operate_time")
    private String operateTime;

    @Body
    @NameInMap("remark")
    private String remark;

    @Body
    @NameInMap("status")
    @Validation(required = true)
    private Integer status;

    @Body
    @NameInMap("third_part_apply_id")
    @Validation(required = true)
    private String thirdPartApplyId;

    @Body
    @NameInMap("user_id")
    @Validation(required = true)
    private String userId;

    private CarApplyModifyRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.operateTime = builder.operateTime;
        this.remark = builder.remark;
        this.status = builder.status;
        this.thirdPartApplyId = builder.thirdPartApplyId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyModifyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return operateTime
     */
    public String getOperateTime() {
        return this.operateTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return thirdPartApplyId
     */
    public String getThirdPartApplyId() {
        return this.thirdPartApplyId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CarApplyModifyRequest, Builder> {
        private String corpId; 
        private String operateTime; 
        private String remark; 
        private Integer status; 
        private String thirdPartApplyId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CarApplyModifyRequest request) {
            super(request);
            this.corpId = request.corpId;
            this.operateTime = request.operateTime;
            this.remark = request.remark;
            this.status = request.status;
            this.thirdPartApplyId = request.thirdPartApplyId;
            this.userId = request.userId;
        } 

        /**
         * 主企业Id
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("corp_id", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * 审批时间
         */
        public Builder operateTime(String operateTime) {
            this.putBodyParameter("operate_time", operateTime);
            this.operateTime = operateTime;
            return this;
        }

        /**
         * 审批备注
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 0申请 1同意 2拒绝 3转交 4取消 5 修改已同意 6 撤销已同意 7 修改审批中 8 已同意(修改被拒绝)  9 撤销审批中n10 已同意(撤销被拒绝) 11 已同意(修改被取消) 12 已同意(撤销被取消)
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * third_part_apply_id.
         */
        public Builder thirdPartApplyId(String thirdPartApplyId) {
            this.putBodyParameter("third_part_apply_id", thirdPartApplyId);
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }

        /**
         * 无userId时传缺省值superAdmin
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CarApplyModifyRequest build() {
            return new CarApplyModifyRequest(this);
        } 

    } 

}
