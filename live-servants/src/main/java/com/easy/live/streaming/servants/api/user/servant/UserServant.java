package com.easy.live.streaming.servants.api.user.servant;

import com.easy.live.streaming.servants.api.user.callback.UserServantFallback;
import com.easy.live.streaming.servants.protocol.input.user.UserInput;
import com.easy.live.streaming.servants.protocol.output.BaseOutput;
import com.easy.live.streaming.servants.protocol.output.user.UserOutput;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Description:用户Api
 * @Author: zhangliangfu
 * @Create on: 2019-07-10 19:02
 */

@FeignClient(name = "live-user-servant", fallbackFactory = UserServantFallback.class)
public interface UserServant {

    /**
     * 创建用户
     * @param input
     * @return
     */
    BaseOutput<UserOutput> createUser(UserInput input);

    /**
     * 用户登录
     * @param input
     * @return
     */
    BaseOutput userLogin(UserInput input);
}