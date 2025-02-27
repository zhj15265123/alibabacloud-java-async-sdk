// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotProbeBindRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotProbeBindRequest</p>
 */
public class DeleteHoneypotProbeBindRequest extends Request {
    @Query
    @NameInMap("BindId")
    private String bindId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ProbeId")
    private String probeId;

    private DeleteHoneypotProbeBindRequest(Builder builder) {
        super(builder);
        this.bindId = builder.bindId;
        this.lang = builder.lang;
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotProbeBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindId
     */
    public String getBindId() {
        return this.bindId;
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

    public static final class Builder extends Request.Builder<DeleteHoneypotProbeBindRequest, Builder> {
        private String bindId; 
        private String lang; 
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotProbeBindRequest request) {
            super(request);
            this.bindId = request.bindId;
            this.lang = request.lang;
            this.probeId = request.probeId;
        } 

        /**
         * BindId.
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
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
         * ProbeId.
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public DeleteHoneypotProbeBindRequest build() {
            return new DeleteHoneypotProbeBindRequest(this);
        } 

    } 

}
