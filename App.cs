public class Repository<TContext> : ReadOnlyRepository<TContext>, IRepository where TContext : DbContext {
private static MemberExpression ResolveMemberExpression(Expression expression)
        {
            switch (expression)
            {
                case MemberExpression memberExpression:
                    return memberExpression;
                case UnaryExpression unaryExpression:
                    return (MemberExpression)unaryExpression.Operand;
                default:
                    throw new NotSupportedException(expression.ToString());
            }
        }
}
