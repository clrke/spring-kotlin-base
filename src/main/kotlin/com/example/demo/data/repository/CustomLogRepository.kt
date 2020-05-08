package com.example.demo.data.repository

import com.example.demo.base.BaseRepository
import com.example.demo.domain.entity.CustomLog
import org.springframework.stereotype.Repository

@Repository
interface CustomLogRepository : BaseRepository<CustomLog, Long>
