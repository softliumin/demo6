package com.example.demo6server.impl;

import com.alipay.common.tracer.core.context.trace.SofaTraceContext;
import com.alipay.common.tracer.core.holder.SofaTraceContextHolder;
import com.alipay.common.tracer.core.span.SofaTracerSpan;
import com.demo6.common.HelloSyncService;

public class HelloSyncServiceImpl implements HelloSyncService {
    @Override
    public String saySync(String string) {
        SofaTraceContext sofaTraceContext = SofaTraceContextHolder.getSofaTraceContext();
//

        SofaTracerSpan span = sofaTraceContext.getCurrentSpan();
        System.out.println();
//        System.out.println(sofaTraceContext.getCurrentSpan().getSofaTracerSpanContext());
        return string;
    }
}
