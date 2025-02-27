// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateCommonOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateCommonOverallConfigRequest</p>
 */
public class OperateCommonOverallConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private OperateCommonOverallConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateCommonOverallConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateCommonOverallConfigRequest, Builder> {
        private String config; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateCommonOverallConfigRequest request) {
            super(request);
            this.config = request.config;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * Specifies whether to enable or disable the feature. Valid values:
         * <p>
         * 
         * *   **on**: enable
         * *   **off**: disable
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   **kdump_switch**: Active defense experience optimization
         * *   **threat_detect**: Dynamic adaptive threat detection capability
         * *   **suspicious_aggregation**: Alert Association
         * *   **alidetect**: File Test
         * *   **USER-ENABLE-SWITCH-TYPE\_38857**: Entrance service execution high-risk operation (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50858**: Web service performs high-risk operations (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50859**: Entrance service execution suspicious operation (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50862**: Cloud Assistant Advanced Protection (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50867**: Create malicious files (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50868**: Create suspicious files (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_64025**: Ingress service execute command \[enhanced mode] (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51229**: Browser service execution a high-risk operation (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51230**: Entrance service execution suspicious operation (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51232**: System processes execution high-risk operations (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51233**: Java service execution high-risk operations (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51234**: Office components execution high-risk operations (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51235**: Web service performs high-risk operations (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52820**: Create malicious files (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52826**: Entrance service execution high-risk operation (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_55251**: Database services execution high-risk operations (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_63725**: Ingress service implants suspicious script/binary file (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_3277**: Suspicious process startup (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50983**: obfuscated command (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51200**: Command line download and run malicious files (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_71131**: Ingress service executes sequence of suspicious behavior (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51225**: Powershell executes high-risk commands (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_51226**: Powershell execute suspicious command (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52821**: Suspicious process startup (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_57242**: Malicious command execution (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_57340**: Command line download and run malicious files (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_39659**: Sensitive Registry Key Protection (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52816**: high-risk account manipulation behavior (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54365**: Create service autorun item (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54366**: Create high-risk autorun item (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54367**: Create scheduled task autorun item (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54368**: Create registry autorun item (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54369**: Create WMI autorun item (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_50869**: Unauthorized execution of high-risk orders (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_53272**: Exploiting Kernel Vulnerabilities to Elevate Privileges (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_54395**: Unauthorized reading and writing of sensitive files (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_57897**: suspected privilege escalation (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_52825**: Unauthorized execution of high-risk orders (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_5507**: malicious drivers (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50876**: Against security software (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_53168**: process debugging (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_54699**: Hijack dynamic link library (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_62981**: Bypassing security monitoring (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_52815**: Load high-risk drivers (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52823**: Running high-risk ARK tools (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54373**: Against security software (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54374**: Intrusion trace cleanup (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54265**: Hijacking the PAM Module (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_54953**: Hashdump Attack (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_54383**: MimiKatz Credential Stealing (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54384**: Hashdump Attack (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_50861**: Information detection (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_52818**: Information detection (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_54034**: Intranet scan (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51228**: High-risk lateral penetration tools (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_50870**: Rebound Shell (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50873**: WebShell execute command
         * *   **USER-ENABLE-SWITCH-TYPE\_51236**: Rebound Shell (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_50877**: Malicious soft communication (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50884**: Suspicious worm script behavior (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_50885**: malicious script behavior (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51201**: ransomware (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_51202**: Suspected Extortion (Linux)
         * *   **USER-ENABLE-SWITCH-TYPE\_52827**: ransomware (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52828**: Suspected Extortion (Windows)
         * *   **USER-ENABLE-SWITCH-TYPE\_52829**: delete system backup behavior (Windows)
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateCommonOverallConfigRequest build() {
            return new OperateCommonOverallConfigRequest(this);
        } 

    } 

}
