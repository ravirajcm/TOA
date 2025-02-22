package com.adammcneilly.toa.fakes

import com.adammcneilly.toa.core.data.Result
import com.adammcneilly.toa.tasklist.domain.model.Task
import com.adammcneilly.toa.tasklist.domain.usecases.GetAllTasksUseCase
import io.mockk.coEvery
import io.mockk.mockk

class FakeGetAllTasksUseCase {
    val mock: GetAllTasksUseCase = mockk()

    fun mockResult(response: Result<List<Task>>) {
        coEvery {
            mock.invoke()
        } returns response
    }
}
