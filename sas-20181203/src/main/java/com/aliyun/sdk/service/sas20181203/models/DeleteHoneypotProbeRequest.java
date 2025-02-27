// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotProbeRequest</p>
 */
public class DeleteHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ProbeId")
    @Validation(required = true)
    private String probeId;

    private DeleteHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotProbeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return probeId
     */
    public String getProbeId() {
        return this.probeId;
    }

    public static final class Builder extends Request.Builder<DeleteHoneypotProbeRequest, Builder> {
        private String lang; 
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotProbeRequest request) {
            super(request);
            this.lang = request.lang;
            this.probeId = request.probeId;
        } 

        /**
         * 设置请求和接收消息的语言类型，默认为**zh**。取值：
         * <p>
         * 
         * - **zh**：中文
         * - **en**：英文
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the probe.
         * <p>
         * 
         * > You can call the [ListHoneypotProbe](~~ListHoneypotProbe~~) operation to query the IDs of probes.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public DeleteHoneypotProbeRequest build() {
            return new DeleteHoneypotProbeRequest(this);
        } 

    } 

}
