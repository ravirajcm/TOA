package com.adammcneilly.toa.addtask.domain.usecases

import com.adammcneilly.toa.core.data.Result
import com.adammcneilly.toa.tasklist.domain.model.Task

/**
 * Given a new task, store that in the user's task list.
 */
interface AddTaskUseCase {

    suspend operator fun invoke(task: Task): Result<Unit>
}
