package com.yimq.remoting;


import com.yimq.remoting.exception.RemotingConnectException;
import com.yimq.remoting.protocol.RemotingCommandProto;

import java.util.List;

public interface RemotingClient extends RemotingService {

    RemotingCommandProto.RemotingCommand invokeSync(final String addr, final RemotingCommandProto.RemotingCommand request
            , final long timeoutMillis) throws InterruptedException, RemotingConnectException;

    void updateNamesrvAddrList(final List<String> addrs);

}
