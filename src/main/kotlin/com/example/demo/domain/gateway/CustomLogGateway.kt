package com.example.demo.domain.gateway

import com.example.demo.base.BaseGateway
import com.example.demo.data.repository.CustomLogRepository
import com.example.demo.domain.entity.CustomLog
import org.springframework.stereotype.Service

@Service
class CustomLogGateway(repository: CustomLogRepository) : BaseGateway<CustomLog, Long>(repository)
