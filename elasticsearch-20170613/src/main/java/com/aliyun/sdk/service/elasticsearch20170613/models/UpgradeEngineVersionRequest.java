// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeEngineVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeEngineVersionRequest</p>
 */
public class UpgradeEngineVersionRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("type")
    private String type;

    @Body
    @NameInMap("version")
    private String version;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private UpgradeEngineVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
        this.version = builder.version;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeEngineVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<UpgradeEngineVersionRequest, Builder> {
        private String instanceId; 
        private String type; 
        private String version; 
        private String clientToken; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeEngineVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
            this.version = request.version;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 升级类型。
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * 升级后的版本
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * 用于保证请求的幂等性。由客户端生成该参数值，要保证在不同请求间唯一，最大不超过64个ASCII字符。
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 是否进行升级前校验。true表示校验，false表示不校验。
         * <p>
         * 注意：版本升级校验涉及集群YML、插件配置、集群状态、索引、资源等检查，强烈建议升级前进行前置校验，否则可能带来升级问题。
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public UpgradeEngineVersionRequest build() {
            return new UpgradeEngineVersionRequest(this);
        } 

    } 

}
