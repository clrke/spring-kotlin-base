package com.example.demo.domain.subinteractor

import com.example.demo.base.BaseCreateCommand
import com.example.demo.domain.entity.CustomLog
import com.example.demo.domain.gateway.CustomLogGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateLog @Autowired constructor(
        logGateway: CustomLogGateway
) : BaseCreateCommand<CustomLog, CustomLogGateway>(logGateway)
